package com.weixin.pojo;

/**
 * 用处触发点击事件的button
 * @author pks
 *
 */
public class CommonButton extends Button {
	private String type;  
    private String key;  
  
    public CommonButton() {
		// TODO Auto-generated constructor stub
	}
    
    public CommonButton(String name,String type, String key) {
		super();
		super.setName(name);
		this.type = type;
		this.key = key;
	}
    /**
     * 默认type 为 “click”
     * @param name
     * @param key
     */
    public CommonButton(String name, String key) {
		super();
		super.setName(name);
		this.type = "click";
		this.key = key;
	}

	public String getType() {  
        return type;  
    }  
  
    public void setType(String type) {  
        this.type = type;  
    }  
  
    public String getKey() {  
        return key;  
    }  
  
    public void setKey(String key) {  
        this.key = key;  
    }  
}
