package com.qindaorong.spi.active;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.compiler.Compiler;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Filter;

import java.util.List;

public class App {

    public static void main(String[] args) {
/*
@Activate(
    group = {"consumer", "provider"},
    value = {"cache"}
)

group表示在哪个端配置
value表示激活的字符串
*/


        URL url = new URL("","",0);
        url = url.addParameter("cache","cache");
        List<Filter> list=  ExtensionLoader.getExtensionLoader(Filter.class).getActivateExtension(url,"cache");
        System.out.println(list.size());
    }
}
