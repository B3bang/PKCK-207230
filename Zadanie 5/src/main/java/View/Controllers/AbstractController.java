package View.Controllers;

import Model.Album;
import Model.Genre;
import Model.Member;
import Model.RecordCollection;

public abstract class AbstractController {
    protected RecordCollection recordCollection;

    protected Genre returnedGenre;

    protected Member returnedMember;

    protected Album returnAlbum;

    public RecordCollection getRecordCollection() {
        return recordCollection;
    }

    public void setRecordCollection(RecordCollection recordCollection) {
        this.recordCollection = recordCollection;
    }

    public Genre getReturnedGenre() {
        return returnedGenre;
    }

    public void setReturnedGenre(Genre returnedGenre) {
        this.returnedGenre = returnedGenre;
    }

    public Member getReturnedMember() {
        return returnedMember;
    }

    public void setReturnedMember(Member returnedMember) {
        this.returnedMember = returnedMember;
    }

    public Album getReturnAlbum() {
        return returnAlbum;
    }

    public void setReturnAlbum(Album returnAlbum) {
        this.returnAlbum = returnAlbum;
    }
}
