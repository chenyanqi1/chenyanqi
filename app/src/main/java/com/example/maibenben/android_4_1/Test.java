package com.example.maibenben.android_4_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class Test extends View {
    private Paint paint;
    Path pa = new Path();
    public Test(Context context) {
        super(context);

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setTextSize(30);
    }

    public Test(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setTextSize(30);
    }
    public Test(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setTextSize(30);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText("嘻嘻嘻",0,30,paint);

        canvas.drawLine(0,50,200,50,paint);

        Rect rect = new Rect(0,70,200,120);
        canvas.drawRect(rect,paint);

        canvas.drawRect(0,130,200,180,paint);

        RectF rectF = new RectF(0,200,200,250);
        canvas.drawRoundRect(rectF,30,30,paint);

        Path path = new Path();
        path.moveTo(30,260);
        path.lineTo(130,360);
        path.lineTo(30,360);
        path.close();
        canvas.drawPath(path,paint);

        Path path1 = new Path();
        path1.addCircle(400,400,100,Path.Direction.CCW);
        canvas.drawTextOnPath("1 2 3 4 5 6 7 8 9",path1,0,0,paint);
        canvas.drawPath(path1,paint);

        canvas.drawPath(pa,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                pa.moveTo(event.getX(),event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                pa.lineTo(event.getX(),event.getY());
                break;
        }
        return true;
    }
}
