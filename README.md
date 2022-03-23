### Description

There appears to be a bug with on Kindle / FireOS where translucent activities can occasionally disappear when returning back to them.

### Device Tested:

Reproduced on a number of kindles, but the one in the video is as follows

Model: Fire HD 8 (10th generation)

Build: 0022247233412

### Reproduction Steps:

Note: This does not happen every time, sometimes it happens on the first try, other times it takes many (tens of tries).

Note: This appears to only happen when using a custom tabs view intent to open the Silk browser, and not a regular view intent.

Video: https://imgur.com/a/mi43G3s

1. Open the example app
2. Click “With Custom Tabs” button
3. Observe the translucent activity appearing with an additional “With Custom Tabs” button
4. Click the button that appeared
5. Assuming Silk is the default browser, observe Silk opening a web page via custom tabs
6. Press the back button
7. Observe the translucent activity being visible, and very quickly dissapearing
8. Observe the ability to interact with the invisible overlay activity as if it were visible
9. Observe pressing back briefly shows the activity finishing with an exit transition
10. Observe pressing the button defined in step 2 briefly shows the activity starting with an enter transition
11. Observe the translucent activity being invisible again, but remaining intractable as if it were visible
