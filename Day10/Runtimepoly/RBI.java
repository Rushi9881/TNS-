package Day10.Runtimepoly;

public class RBI {
    public float getRateOfInterest() {
        return 7.0f;
    }
}

class Axis extends RBI {
    public float getRateOfInterest() {
        return 6.6f;
    }
}

class ICICI extends RBI {
    public float getRateOfInterest() {
        return 7.9f;
    }
}
class HDFC extends RBI {
    public float getRateOfInterest() {
        return 8.0f;
    }

}


