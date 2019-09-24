package com.qindaorong.spi.api;

public interface IMessageChannel {

    /**
     * 发送短信
     * @param context
     * @return
     */
    String sendMessage(String context);
}
