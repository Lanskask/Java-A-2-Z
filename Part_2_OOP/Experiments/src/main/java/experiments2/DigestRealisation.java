package experiments2;

/**
 * Created by a1 on 22.01.17.
 */
public class DigestRealisation extends Digest {
    @Override
    public byte[] digest(byte[] input) {
        return super.digest(input);
    }

    @Override
    protected byte[] doDigest(byte[] input) {
        return new byte[0];
    }
}

