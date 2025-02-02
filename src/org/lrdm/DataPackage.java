package org.lrdm;

/**Represents a single data package to be held by mirrors.
 *
 * @author Anonymous
 */
public class DataPackage {
    /** the file size of the data package measured in GB*/
    private final int fileSize; //in GB
    /** how much data of the file measured in GB is already received. has to be less than fileSize. */
    private int received; //in GB

    public DataPackage(int fileSize) {
        this.fileSize = fileSize;
        received = 0;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getReceived() {
        return received;
    }

    public void increaseReceived(int amount) {
        received += amount;
        if(received > fileSize) received = fileSize;
    }

    public boolean isLoaded() {
        return received == fileSize;
    }

    public void reset() {
        this.received = 0;
    }
}
