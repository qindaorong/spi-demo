package com.qindaorong.spi.adaption;

import org.apache.dubbo.common.compiler.Compiler;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class App {

    public static void main(String[] args) {
        //自定义静态拓展点
        Compiler compiler = ExtensionLoader.getExtensionLoader(Compiler.class).getAdaptiveExtension();

        System.out.println(compiler);
    }
}
