package com.array;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zouwenhai
 * @date 2021/1/28 15:52
 */
@Builder
@Data
public class UserBO {


    private Integer id;

    private String name;
}
