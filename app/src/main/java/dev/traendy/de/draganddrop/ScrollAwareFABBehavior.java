package dev.traendy.de.draganddrop;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by speters on 03.12.17.
 */

public class ScrollAwareFABBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {
    private static final String TAG = ScrollAwareFABBehavior.class.getSimpleName();

    public ScrollAwareFABBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout,
                                       FloatingActionButton child, View directTargetChild, View target, int nestedScrollAxes, int type) {
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL ||
                super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target,
                        nestedScrollAxes, type);
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child,
                               View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed,
                dyUnconsumed, type);
        Log.i(TAG, "CHild: " +child.getClass().getSimpleName());
        if (dyConsumed > 0 && child.getVisibility() == View.VISIBLE) {
           // Log.i(TAG, "dyConsumed: " + dyConsumed);
           // Log.i(TAG, "dyUnConsumed: " + dyUnconsumed);
            //child.setVisibility(View.INVISIBLE);

           // child.hide();

        } else if (dyConsumed < 0 && child.getVisibility() != View.VISIBLE) {
           // Log.i(TAG, "dyConsumed: " + dyConsumed);
           // Log.i(TAG, "dyUnConsumed: " + dyUnconsumed);
           // child.setVisibility(View.VISIBLE);

            //child.show();
        }
    }


}