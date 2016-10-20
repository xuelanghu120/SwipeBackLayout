package me.pexcn.swipebacklayout.app;

import me.pexcn.swipebacklayout.SwipeBackLayout;

/**
 * @author Yrom
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public interface BaseSwipeBackActivity {
    /**
     * @return the SwipeBackLayout associated with this activity.
     */
    SwipeBackLayout getSwipeBackLayout();

    void setSwipeBackEnable(boolean enable);

    /**
     * Scroll out contentView and finish the activity
     */
    void scrollToFinishActivity();
}
