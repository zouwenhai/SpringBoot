package com.collect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author zouwenhai
 * @date 2021/5/25 16:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SetEntity {


    private Long id;

    private String num;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetEntity setEntity = (SetEntity) o;
        return Objects.equals(num, setEntity.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
