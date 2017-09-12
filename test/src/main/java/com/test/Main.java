package com.test;

import java.util.List;

import com.dao.AllNetworkTaskDao;
import com.dao.MonitorDao;
import com.entities.AllNetworkTask;
import com.entities.Monitor;
import com.utils.MybatisConfig;

public class Main {

	public static void main(String[] args) {

		MonitorDao monitorDao = new MonitorDao(MybatisConfig.ServerEnum.development);
		AllNetworkTaskDao allNetworkTaskDao = new AllNetworkTaskDao(MybatisConfig.ServerEnum.development2);
		List<Monitor> monitors = monitorDao.getAll();
		for (Monitor monitor : monitors) {
			AllNetworkTask allNetworkTask = 
					new AllNetworkTask(null, monitor.getKeywords(), 500, 1824, 6, 0, "百度搜索",monitor.getTimeEnd());
			List<AllNetworkTask> allNetworkTasks = allNetworkTaskDao.getAll();
			for (AllNetworkTask allNetworkTask2 : allNetworkTasks) {
				if (allNetworkTask.getKeyword().equals(allNetworkTask2.getKeyword())
						&& allNetworkTask.getSiteName().equals(allNetworkTask2.getSiteName())
						&& allNetworkTask.getTimeEnd().equals(allNetworkTask2.getTimeEnd())) {
					return;
				}
			}
			allNetworkTaskDao.save(allNetworkTask);
		}
	}
}
