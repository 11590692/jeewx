package com.jeecg.qywx.account.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.jeecg.qywx.util.SystemUtil;

/**
 * 描述：</b>QywxAgent:应用信息表<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author Alex
 * @since：2016年03月24日 14时55分38秒 星期四 
 * @version:1.0
 */
public class QywxAgent implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 *回调token
	 */
	private String token;
	/**
	 *回调EncodingAESKey
	 */
	private String encodingAESKey;
	
	public void setToken(String token) {
		this.token = token;
	}
	public String getToken() {
		return token;
	}
	public void setEncodingAESKey(String encodingAESKey) {
		this.encodingAESKey = encodingAESKey;
	}
	public String getEncodingAESKey() {
		return encodingAESKey;
	}
}
