package WorkPermission;

import java.util.Objects;

public class PPE {

    private String id;

    private String EyeProtection;
    private String SafetyHat;
    private String GasMonitor;
    private String Gloves;
    private String safetyBoots;
    private String helmet;
    private String mask;
    private String earPlugs;
    private String flameResistantClothe;

    public PPE(String id, String eyeProtection, String safetyHat, String gasMonitor, String gloves,
               String safetyBoots, String helmet, String mask, String earPlugs, String flameResistantClothe) {
        this.id = id;
        EyeProtection = eyeProtection;
        SafetyHat = safetyHat;
        GasMonitor = gasMonitor;
        Gloves = gloves;
        this.safetyBoots = safetyBoots;
        this.helmet = helmet;
        this.mask = mask;
        this.earPlugs = earPlugs;
        this.flameResistantClothe = flameResistantClothe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEyeProtection() {
        return EyeProtection;
    }

    public void setEyeProtection(String eyeProtection) {
        EyeProtection = eyeProtection;
    }

    public String getSafetyHat() {
        return SafetyHat;
    }

    public void setSafetyHat(String safetyHat) {
        SafetyHat = safetyHat;
    }

    public String getGasMonitor() {
        return GasMonitor;
    }

    public void setGasMonitor(String gasMonitor) {
        GasMonitor = gasMonitor;
    }

    public String getGloves() {
        return Gloves;
    }

    public void setGloves(String gloves) {
        Gloves = gloves;
    }

    public String getSafetyBoots() {
        return safetyBoots;
    }

    public void setSafetyBoots(String safetyBoots) {
        this.safetyBoots = safetyBoots;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getEarPlugs() {
        return earPlugs;
    }

    public void setEarPlugs(String earPlugs) {
        this.earPlugs = earPlugs;
    }

    public String getFlameResistantClothe() {
        return flameResistantClothe;
    }

    public void setFlameResistantClothe(String flameResistantClothe) {
        this.flameResistantClothe = flameResistantClothe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PPE ppe = (PPE) o;
        return Objects.equals(id, ppe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PPE{" +
                "id='" + id + '\'' +
                ", EyeProtection='" + EyeProtection + '\'' +
                ", SafetyHat='" + SafetyHat + '\'' +
                ", GasMonitor='" + GasMonitor + '\'' +
                ", Gloves='" + Gloves + '\'' +
                ", safetyBoots='" + safetyBoots + '\'' +
                ", helmet='" + helmet + '\'' +
                ", mask='" + mask + '\'' +
                ", earPlugs='" + earPlugs + '\'' +
                ", flameResistantClothe='" + flameResistantClothe + '\'' +
                '}';
    }

}
