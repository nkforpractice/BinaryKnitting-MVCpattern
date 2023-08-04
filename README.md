# BinaryKnitting-MVCpattern

This application is trying to use knitting techniques to encrypt information. The specific encryption way is as follows:

1. Convert English messages into binary code using ASCII.
2. Use the "purl stitch" of knitting to represent 0, and use "knit stitch" to represent 1.

Based on this encryption way, we can create a simple application using the MVC pattern.

The fucntion of the  Model part is : 

- Converting the message to binary.
- Converting binary message into stitches instruction

The Controller:

- receive the input message to pass it to the model to deal with the message

The View: 

- The GUI part that show an input box and the final pattern.
