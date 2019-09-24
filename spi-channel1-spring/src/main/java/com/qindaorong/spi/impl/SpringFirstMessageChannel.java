package com.qindaorong.spi.impl;

import com.qindaorong.spi.api.IMessageChannel;

public class SpringFirstMessageChannel implements IMessageChannel {
    @Override
    public String sendMessage(String context) {
        return "SpringFirstMessageChannel-sendMessage:"+ context;
    }
}
