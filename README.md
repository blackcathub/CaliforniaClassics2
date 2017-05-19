# California Classics GARAGE v2 _[CaliforniaClassics2]_
>`PROJECT 2 version 2` for Googles Udacity Android Developement Course

This is a new updated version of the Project 2 for Googles Android Development Scholarship. You can check the original version here: [Project 2 [V1]](https://github.com/blackcathub/CaliforniaClassics). I made the new version to incorporate all the changes proposed by the teachers and colleagues from the course and decided to make a new repository instead of a branch for the old one because the entire app was re-written using different solutions. The initial goals of the project remain the same but I approached them in a new way and expanded with additional features.
----------------------------
* **_LAYOUT AND STYLING_**

I redesigned the looks of the app to make all the elemnts follow the same idea for styling and apply a consistent colour scheme to them. To build the layout I decided to use ConstraintLayout this time and take the advantage of constraints to position each elemnt of the app. Constraint layout is placed in a ScrollView to enable vertical scrolling and put more content in the app. 

* **_UPDATED ELEMENTS_**

Most significant changes would include main picture being put behind the scroll view to remain in place while the content is being scrolled. I also added overlapping tint images to make it look smooth and fade gradually into black even if it gets cropped on the bottom edge to fit the dedicated area in landscape mode. Description is now placed in a container that look simmilar to contact detail fields. It stretches itself to match the width of the screen and wrap the text inside inside it vertically. Contact detail fields still have "bullet-like" containers but now have fixed height and the new colour scheme applied. 

* **_ADDED FEATURES_**

I introduced a few new features that were absent in the Version 1:
>* App logo that includes company name is now detatched from the main picture and moves on top of it with the rest of the content.
>* "Partner logos" are removed from the main picture and replaced with a picture gallery.
>* Picture gallery is scrollable horizontally, clicking each miniature opens a full screen view of the image on a new layer overlapping the main view of the app.
>* Java code was added to intercept back button click while full screen layer is visable and return to main view of the app.
>* 5 custom social buttons were added on the bottom distributed evenly along the bottom edge of the screen.
>* Each social button received a Java code that runs a corresponding app and displays content connected with the company this card was made for.
>* Buttons received animations and animation listeners to make them execute assigned action after the animation finishes.
>* Some other minor bugfixes and improvements were introduced to make the app run faster and smoother.

* **_DEMO VIDEO_**

[![DEMO ON YOUTUBE](https://img.youtube.com/vi/Z6e0Rp32f9g/0.jpg)](https://www.youtube.com/watch?v=Z6e0Rp32f9g)

* **_SCREENSHOTS_**

I grayed out the area initially not visable on the screen but the user can scroll down to reveal it.

<img src="https://cloud.githubusercontent.com/assets/25821037/23375374/78c13b90-fd28-11e6-8c2d-4ddadba0c953.png" align="center" width="280" > <img src="https://cloud.githubusercontent.com/assets/25821037/23375375/78c39d90-fd28-11e6-9bca-cf67280a85c6.png" align="center" width="525" >

Image full screen layer called by clicking on the gallery miniatures.

<img src="https://cloud.githubusercontent.com/assets/25821037/23375432/a4d6fcf6-fd28-11e6-9cfc-6958a9004cee.png" align="center" height="420" > <img src="https://cloud.githubusercontent.com/assets/25821037/23375433/a4dd9aa2-fd28-11e6-9586-22a84bc1a839.png" align="center" width="420" >

