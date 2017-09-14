package com.test;

import java.util.List;

import com.dao.AllNetworkTaskDao;
import com.dao.SpecialDao;
import com.entities.AllNetworkTask;
import com.entities.Search;
import com.entities.SpecialDomain;
import com.utils.MyUtils;

public class Main2 {

	public static void main(String[] args) {

		SpecialDao specialDao = new SpecialDao(MyUtils.ServerEnum.development);
		AllNetworkTaskDao allNetworkTaskDao = new AllNetworkTaskDao(MyUtils.ServerEnum.development2);

		List<SpecialDomain> specials = specialDao.getSpecial();
		for (SpecialDomain special : specials) {
			Search search = MyUtils.getSearch();
			AllNetworkTask allNetworkTask = new AllNetworkTask(null, special.getKeywords(), search.getSource(),
					search.getSourceId(), 6, 0, search.getSiteName(), special.getTimeEnd());
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