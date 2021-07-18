package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: yangjiang
 * @create: 2021-07-15 20:35
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T  data;

    public CommonResult(Integer code, String message)
    {
        this(code,message,null);
    }

}
