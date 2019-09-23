package edu.nyu.cs9053.homework3;

/**
 * User: blangel
 */
public class Grayscaler {

    /**
     * Turns {@code pixel} into gray-scale
     *
     * @implNote {@code pixel} is an RGB value where blue is the first 8 bits, green
     *           is the second 8 bits and red is the third 8 bits
     * @implNote to gray-scale an RGB use this formula
     *           {@literal 0.21 * red + 0.72 * green + 0.07 * blue}
     * @param pixel to gray-scale
     * @return the gray-scaled value
     */
    public double grayScale(int pixel) {
        // TODO - implement this
        int intRed = (pixel >> 16) & 0xff;
        int intGreen = (pixel >> 8) & 0xff;
        int intBlue = (pixel >> 0) & 0xff;

        double red = 0.21 * intRed;
        double green = 0.72 * intGreen;
        double blue = 0.07 * intBlue;

        return red + green + blue;
    }

}
