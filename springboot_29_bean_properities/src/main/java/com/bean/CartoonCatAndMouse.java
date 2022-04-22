package com.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Data
@EnableConfigurationProperties(CartoonProperties.class)
public class CartoonCatAndMouse {
    private Cat cat;
    private Mouse mouse;


    private CartoonProperties cartoonProperties;

    public CartoonCatAndMouse(CartoonProperties cartoonProperties)
    {
        this.cartoonProperties = cartoonProperties;
        cat = new Cat();
        cat.setName(StringUtils.hasText(cartoonProperties.getCat().getName())?cartoonProperties.getCat().getName():"tom");
        cat.setAge(3);
        mouse = new Mouse();
        mouse.setName(cartoonProperties.getMouse().getName());
        mouse.setAge(4);
    }
    public void play(){
        System.out.println(cat.getAge() + "岁的" + cat.getName() + "和" + mouse.getAge() + "岁的" +mouse.getName() + "打起来了");
    }
}
