package edu.orangecoastcollege.cs273.flagquiz;

/**
 * Represents a Country for the purposes of the FlagQuiz, including the country's name,
 * region and the file name (including path) for its image.
 *
 * @author Michael Paulding
 * @version 1.0
 */
public class Country {

    private String mName;
    private String mRegion;
    private String mFileName;

    /**
     * Instantiates a new <code>Country</code> given its name and region.
     * @param name The name of the <code>Country</code>
     * @param region The region (Africa, Asia, Europe, North America, Oceania, or South America
     *               of the <code>Country</code>
     */
    public Country(String name, String region) {
        mName = name;
        mRegion = region;
        name = name.replaceAll(" ", "_");
        region = region.replaceAll(" ", "_");
        mFileName = region + "/" + region + "-" + name + ".png";
    }

    /**
     * Gets the name of the <code>Country</code>.
     * @return The name of the <code>Country</code>
     */
    public String getName() {
        return mName;
    }

    /**
     * Gets the region of the <code>Country</code>.
     * @return The region of the <code>Country</code>
     */
    public String getRegion() {
        return mRegion;
    }

    /**
     * Gets the file name of the <code>Country</code> with its path. For example:
     * Africa/Africa-Algeria.png
     * @return The file name of the <code>Country</code>
     */
    public String getFileName() {
        return mFileName;
    }

    /**
     * Compares two Countries for equality based on name, region and file name.
     * @param o The other country.
     * @return True if the countries are the same, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!mName.equals(country.mName)) return false;
        if (!mRegion.equals(country.mRegion)) return false;
        return mFileName.equals(country.mFileName);

    }

    /**
     * Generates an integer based hash code to uniquely represent this <code>Country</code>.
     * @return An integer based hash code to represent this <code>Country</code>.
     */
    @Override
    public int hashCode() {
        int result = mName.hashCode();
        result = 31 * result + mRegion.hashCode();
        result = 31 * result + mFileName.hashCode();
        return result;
    }

    /**
     * Generates a text based representation of this <code>Country</code>.
     * @return A text based representation of this <code>Country</code>.
     */
    @Override
    public String toString() {
        return "Country{" +
                "Name='" + mName + '\'' +
                ", Region='" + mRegion + '\'' +
                ", FileName='" + mFileName + '\'' +
                '}';
    }
}
