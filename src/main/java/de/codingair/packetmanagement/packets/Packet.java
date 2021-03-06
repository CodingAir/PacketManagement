package de.codingair.packetmanagement.packets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * A simple packet interface to indicate a Packet.
 */
public interface Packet {
    void write(DataOutputStream out) throws IOException;

    void read(DataInputStream in) throws IOException;
}
