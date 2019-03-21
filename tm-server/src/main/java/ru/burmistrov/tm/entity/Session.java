package ru.burmistrov.tm.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
public class Session extends AbstractEntity implements Cloneable {

    private String userId;

    private String signature;

    private Date timesTemp = new Date();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}