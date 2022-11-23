package com.example.hkws.DTO.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
 * 查询条件
 */
@Data
public class LoginDTO {
    @NotNull(message = "ip不能为空")
    @ApiModelProperty(name = "ip", value = "ip", required = true, dataType = "String")
    public String ip;

    @ApiModelProperty(name = "account", value = "account", required = true, dataType = "String")
    public String account;

    @ApiModelProperty(name = "password", value = "password", required = true, dataType = "String")
    public String password;

    @ApiModelProperty(name = "port", value = "port", required = true, dataType = "short")
    public short port;
}
