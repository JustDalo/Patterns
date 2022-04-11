package com.dalo.patterns.structural_patterns.facade.facade;

import com.dalo.patterns.structural_patterns.facade.dao.UserDao;
import com.dalo.patterns.structural_patterns.facade.model.User;
import com.dalo.patterns.structural_patterns.facade.service.NotificationService;

public class UserFacade {
    private NotificationService notificationService;
    private UserDao userDao;

    public UserFacade(NotificationService notificationService, UserDao userDao) {
        this.notificationService = notificationService;
        this.userDao = userDao;
    }

    public void SendNotificationToUser(long id) {
        //there may be more complex logic
        User user = userDao.getUserById(id);
        notificationService.sendNotification(user, "Message");
    }
}
