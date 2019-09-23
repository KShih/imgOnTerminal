### Motivation
* Demonstrate your ability to program with objects in Java

### Instructions
* There is one task to complete.  All of the TODO statements in the code!  Doing so will allow you to take any sequence of images (gif/png/jpeg) and create an ASCII art animation!

### Technique to learn
- Read File
  - ![](assets/markdown-img-paste-20190921003251315.png)
- Get Last/Third/Second/First 8 bit in 32-bit int
    - Last: (pixel >> 0) & 0xff
    - Third: (pixel >> 8) & 0xff
    - Second: (pixel >> 16) & 0xff
- Hex, Byte, Bit
    - 0x means __Hex__, means Sixteen-th進位
    - 0b means __Binary__
    - 0xff == 0b11111111
    - >> means bitwise
        - >> 8 : right shift 8 bits, or right shite 2 byte
    - More Test Example:
        - pixel = 0x00101111
            - pixel & 0xff: 0x11
            - (pixel>>0) & 0xff: 0x11
            - (pixel>>8) & 0xff: 0x11
            - (pixel>>16) & 0xff: 0x10
            - (pixel>>24) & 0xff: 0x00
