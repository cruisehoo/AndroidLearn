package com.cruise.topbarsample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * 
 * @author Cruise
 * 自定义标题栏 可定制
 * 
 */
public class TopBar extends RelativeLayout {

	private Context mContext = null;
	private ImageView mRight = null;
	private ImageView mLeft = null;
	
	public TopBar(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public TopBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public TopBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 设置右边的按钮
	 * 
	 */
	public void setButtonRight() {
		mRight = new ImageView(mContext);
		
		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		
		addView(mRight, params);
	}
	
	/**
	 * 设置左边的按钮
	 */
	public void setButtonLeft() {
		
	}

}
