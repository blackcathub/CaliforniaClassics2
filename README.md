# California Classics GARAGE visit card [V2]
>`PROJECT 2 version 2` for Googles Udacity Android Developement Course

This a second alternative version of the Project 2 for Googles Android Development Scholarship. You can check the original version here: [Project 2 [V1]](https://github.com/blackcathub/CaliforniaClassics). I made the new version to incorporate all the changes proposed by the teachers and colleagues from the course and decided to make a new repository instead of a branch for the old one because the entire app was re-written using different solutions. The initial goals of the project remain the same but I approached them in a new way and expanded with additional features.
----------------------------
I redesigned the looks of the app to make all the elemnts follow the same idea for styling and apply a consistent colour scheme to them. To build the layout I decided to use ConstraintLayout this time and take the advantage of constraints to position each elemnt of the app. Constraint layout is placed in a ScrollView to enable vertical scrolling and put more content in the app. 

Most significant changes would include main picture being put behind the scroll view to remain in place while the content is being scrolled. I also added overlapping tint images to make it look smooth and fade gradually into black even if it gets cropped on the bottom edge to fit the dedicated area in landscape mode. Description is now placed in a container that look simmilar to contact detail fields. It stretches itself to match the width of the screen and wrap the text inside inside it vertically. Contact detail fields still have "bullet-like" containers but now have fixed height and the new colour scheme applied. 

I also introduced a few new features that were absent in the Version 1:
* App logo that includes company name is now detatched from the main picture and moves on top of it with the rest of the content.
* "Partner logos" are removed from the main picture and replaced with a picture gallery.
* Picture gallery is scrollable horizontally, clicking each miniature opens a full screen view of the image on a new layer overlapping the main view of the app.
* Java code was added to intercept back button click while full screen layer is visable and return to main view of the app.
* 5 custom social buttons were added on the bottom distributed evenly along the bottom edge of the screen.
* Each social button received a Java code that runs a corresponding app and displays content connected with the company this card was made for.
* Buttons received animations and animation listeners to make them execute assigned action after the animation finishes.
* Some other minor bugfixes and improvements were introduced to make the app run faster and smoother.
