/*
 * Copyright (C) 2012 RoboVM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.cocoatouch.uikit;

/*<imports>*/
import org.robovm.cocoatouch.coreanimation.*;
import org.robovm.cocoatouch.coredata.*;
import org.robovm.cocoatouch.coregraphics.*;
import org.robovm.cocoatouch.coreimage.*;
import org.robovm.cocoatouch.foundation.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.bind.*;
import org.robovm.objc.block.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
/*</imports>*/

/**
 *
 *
 * <div class="javadoc">
 *   @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html">UIWindow Class Reference</a>
 *   @since Available in iOS 2.0 and later.
 * </div>
 */
/*<library>*/@Library("UIKit")/*</library>*/
public class /*<name>*/ UIWindow /*</name>*/ 
    extends /*<extends>*/ UIView /*</extends>*/ 
    /*<implements>*/ /*</implements>*/ {

    static {
        ObjCRuntime.bind(/*<name>*/ UIWindow /*</name>*/.class);
    }

    private static final ObjCClass objCClass = ObjCClass.getByType(/*<name>*/ UIWindow /*</name>*/.class);

    /*<constructors>*/
    protected UIWindow(SkipInit skipInit) { super(skipInit); }
    public UIWindow() {}
    
    /*</constructors>*/
    /*<properties>*/
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/keyWindow">@property(nonatomic, readonly, getter=isKeyWindow) BOOL keyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("isKeyWindow") public native boolean isKeyWindow();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/rootViewController">@property(nonatomic, retain) UIViewController *rootViewController</a>
     * @since Available in iOS 4.0 and later.
     */
    @Bind("rootViewController") public native UIViewController getRootViewController();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/rootViewController">@property(nonatomic, retain) UIViewController *rootViewController</a>
     * @since Available in iOS 4.0 and later.
     */
    @Bind("setRootViewController:") public native void setRootViewController(UIViewController v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/screen">@property(nonatomic, retain) UIScreen *screen</a>
     * @since Available in iOS 3.2 and later.
     */
    @Bind("screen") public native UIScreen getScreen();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/screen">@property(nonatomic, retain) UIScreen *screen</a>
     * @since Available in iOS 3.2 and later.
     */
    @Bind("setScreen:") public native void setScreen(UIScreen v);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/windowLevel">@property(nonatomic) UIWindowLevel windowLevel</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("windowLevel") public native float getWindowLevel();
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instp/UIWindow/windowLevel">@property(nonatomic) UIWindowLevel windowLevel</a>
     * @since Available in iOS 2.0 and later.
     */
    @Bind("setWindowLevel:") public native void setWindowLevel(float v);
    /*</properties>*/
    /*<methods>*/
    
    private static final Selector becomeKeyWindow = Selector.register("becomeKeyWindow");
    @Bridge(symbol = "objc_msgSend") private native static void objc_becomeKeyWindow(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_becomeKeyWindowSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/becomeKeyWindow">- (void)becomeKeyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    public void becomeKeyWindow() {
        if (customClass) { objc_becomeKeyWindowSuper(getSuper(), this, becomeKeyWindow); } else { objc_becomeKeyWindow(this, becomeKeyWindow); }
    }
    
    private static final Selector convertPoint$fromWindow$ = Selector.register("convertPoint:fromWindow:");
    @Bridge(symbol = "objc_msgSend") private native static CGPoint objc_convertPointFromWindow(UIWindow __self__, Selector __cmd__, CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGPoint objc_convertPointFromWindowSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__, CGPoint point, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertPoint:fromWindow:">- (CGPoint)convertPoint:(CGPoint)point fromWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGPoint convertPointFromWindow(CGPoint point, UIWindow window) {
        if (customClass) { return objc_convertPointFromWindowSuper(getSuper(), this, convertPoint$fromWindow$, point, window); } else { return objc_convertPointFromWindow(this, convertPoint$fromWindow$, point, window); }
    }
    
    private static final Selector convertPoint$toWindow$ = Selector.register("convertPoint:toWindow:");
    @Bridge(symbol = "objc_msgSend") private native static CGPoint objc_convertPointToWindow(UIWindow __self__, Selector __cmd__, CGPoint point, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGPoint objc_convertPointToWindowSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__, CGPoint point, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertPoint:toWindow:">- (CGPoint)convertPoint:(CGPoint)point toWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGPoint convertPointToWindow(CGPoint point, UIWindow window) {
        if (customClass) { return objc_convertPointToWindowSuper(getSuper(), this, convertPoint$toWindow$, point, window); } else { return objc_convertPointToWindow(this, convertPoint$toWindow$, point, window); }
    }
    
    private static final Selector convertRect$fromWindow$ = Selector.register("convertRect:fromWindow:");
    @Bridge(symbol = "objc_msgSend") private native static CGRect objc_convertRectFromWindow(UIWindow __self__, Selector __cmd__, CGRect rect, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGRect objc_convertRectFromWindowSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__, CGRect rect, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertRect:fromWindow:">- (CGRect)convertRect:(CGRect)rect fromWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGRect convertRectFromWindow(CGRect rect, UIWindow window) {
        if (customClass) { return objc_convertRectFromWindowSuper(getSuper(), this, convertRect$fromWindow$, rect, window); } else { return objc_convertRectFromWindow(this, convertRect$fromWindow$, rect, window); }
    }
    
    private static final Selector convertRect$toWindow$ = Selector.register("convertRect:toWindow:");
    @Bridge(symbol = "objc_msgSend") private native static CGRect objc_convertRectToWindow(UIWindow __self__, Selector __cmd__, CGRect rect, UIWindow window);
    @Bridge(symbol = "objc_msgSendSuper") private native static CGRect objc_convertRectToWindowSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__, CGRect rect, UIWindow window);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/convertRect:toWindow:">- (CGRect)convertRect:(CGRect)rect toWindow:(UIWindow *)window</a>
     * @since Available in iOS 2.0 and later.
     */
    public CGRect convertRectToWindow(CGRect rect, UIWindow window) {
        if (customClass) { return objc_convertRectToWindowSuper(getSuper(), this, convertRect$toWindow$, rect, window); } else { return objc_convertRectToWindow(this, convertRect$toWindow$, rect, window); }
    }
    
    private static final Selector makeKeyAndVisible = Selector.register("makeKeyAndVisible");
    @Bridge(symbol = "objc_msgSend") private native static void objc_makeKeyAndVisible(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_makeKeyAndVisibleSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/makeKeyAndVisible">- (void)makeKeyAndVisible</a>
     * @since Available in iOS 2.0 and later.
     */
    public void makeKeyAndVisible() {
        if (customClass) { objc_makeKeyAndVisibleSuper(getSuper(), this, makeKeyAndVisible); } else { objc_makeKeyAndVisible(this, makeKeyAndVisible); }
    }
    
    private static final Selector makeKeyWindow = Selector.register("makeKeyWindow");
    @Bridge(symbol = "objc_msgSend") private native static void objc_makeKeyWindow(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_makeKeyWindowSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/makeKeyWindow">- (void)makeKeyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    public void makeKeyWindow() {
        if (customClass) { objc_makeKeyWindowSuper(getSuper(), this, makeKeyWindow); } else { objc_makeKeyWindow(this, makeKeyWindow); }
    }
    
    private static final Selector resignKeyWindow = Selector.register("resignKeyWindow");
    @Bridge(symbol = "objc_msgSend") private native static void objc_resignKeyWindow(UIWindow __self__, Selector __cmd__);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_resignKeyWindowSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/resignKeyWindow">- (void)resignKeyWindow</a>
     * @since Available in iOS 2.0 and later.
     */
    public void resignKeyWindow() {
        if (customClass) { objc_resignKeyWindowSuper(getSuper(), this, resignKeyWindow); } else { objc_resignKeyWindow(this, resignKeyWindow); }
    }
    
    private static final Selector sendEvent$ = Selector.register("sendEvent:");
    @Bridge(symbol = "objc_msgSend") private native static void objc_sendEvent(UIWindow __self__, Selector __cmd__, UIEvent event);
    @Bridge(symbol = "objc_msgSendSuper") private native static void objc_sendEventSuper(ObjCSuper __super__, UIWindow __self__, Selector __cmd__, UIEvent event);
    /**
     * @see <a href="http://developer.apple.com/library/ios/documentation/uikit/reference/UIKit_Framework/../UIWindow_Class/UIWindowClassReference/UIWindowClassReference.html#//apple_ref/occ/instm/UIWindow/sendEvent:">- (void)sendEvent:(UIEvent *)event</a>
     * @since Available in iOS 2.0 and later.
     */
    public void sendEvent(UIEvent event) {
        if (customClass) { objc_sendEventSuper(getSuper(), this, sendEvent$, event); } else { objc_sendEvent(this, sendEvent$, event); }
    }
    /*</methods>*/

}