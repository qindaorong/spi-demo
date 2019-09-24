package com.qindaorong.spi.impl;

import com.qindaorong.spi.api.IMessageChannel;

public class Demo2MessageChannel implements IMessageChannel {
    @Override
    public String sendMessage(String context) {
        return "Demo2MessageChannel-sendMessage:"+ context;
    }
}
