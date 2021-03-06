package com.test;

import java.util.List;

import com.dao.AllNetworkTaskDao;
import com.dao.MonitorDao;
import com.entities.AllNetworkTask;
import com.entities.Monitor;
import com.entities.Search;
import com.utils.MyUtils;

public class Main {

	public static void main(String[] args) {

		MonitorDao monitorDao = new MonitorDao(MyUtils.ServerEnum.development);
		AllNetworkTaskDao allNetworkTaskDao = new AllNetworkTaskDao(MyUtils.ServerEnum.development2);
		
		List<Monitor> monitors = monitorDao.getAll();
		for (Monitor monitor : monitors) {
			Search search = MyUtils.getSearch();
			AllNetworkTask allNetworkTask = 
					new AllNetworkTask(null, monitor.getKeywords(), search.getSource(), search.getSourceId(), 6, 0, search.getSiteName(),monitor.getTimeEnd());
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
