package com.yonghen.springcloudzy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: ZhangYi
 * @Date: 2022/07/09/  23:06
 * @Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;

    /*public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Payment() {
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }*/
}
