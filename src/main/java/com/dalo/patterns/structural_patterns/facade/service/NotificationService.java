package com.dalo.patterns.structural_patterns.facade.service;

import com.dalo.patterns.structural_patterns.facade.model.User;

public interface NotificationService {
    void sendNotification(User user, String message);
}
