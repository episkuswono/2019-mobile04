package id.ac.polinema.intent.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Siswa implements Parcelable {
    private long id;
    private String name;
    private int kelas;

    public Siswa(long id, String name, int kelas) {
        this.id = id;
        this.name = name;
        this.kelas = kelas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKelas() {
        return kelas;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.kelas);
    }

    protected Siswa(Parcel in) {
        this.id = in.readLong();
        this.name = in.readString();
        this.kelas = in.readInt();
    }

    public static final Creator<Siswa> CREATOR = new Creator<Siswa>() {
        @Override
        public Siswa createFromParcel(Parcel source) {
            return new Siswa(source);
        }

        @Override
        public Siswa[] newArray(int size) {
            return new Siswa[size];
        }
    };
}
