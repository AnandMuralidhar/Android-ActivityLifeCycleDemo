# Android-ActivityLifeCycleDemo
Activity Life Cycle Demo Application
						

1.	This is the first activity of the application. The counter gets incremented every time the onRestart() method is called i.e.,
for every restart of the activity.
                     
2.	When button is pressed to launch Activity Two, Activity One will stop and Activity two will get started.

3.	Finish Two button will close the 2nd activity and restart the first activity. This time the counter gets incremented!

4.	If Activity Two is launched again and recents menu is pressed. The app will be in task view. 
Once we go back to app with the Activity Two kept open this will again increment the counter as onRestart() is called. 
And Once we go back to Activity one, it will again increment the counter. Thus, counter changes from 1 to 3.

5.	Launching of a Dialog activity will result in a onPause() call and won’t cause the counter to increment. 
OnResume() will get called and so no change in the counter!

                                      
