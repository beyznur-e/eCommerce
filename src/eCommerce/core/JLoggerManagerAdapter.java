package eCommerce.core;

import eCommerce.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void log(String message) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.logMessage(message);
    }
}
