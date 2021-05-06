package dmacc.drama.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rumbi
 * Date: 4/30/21
 * Time: 6:42 AM
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Language extends Node {
    private static int nextId = 1;
    private int langId;
    private String languageName;
    private List<Drama> dramas;

    public Language(String languageName) {
        super(AttrType.LANGUAGE);
        this.langId = nextId++;
        this.languageName = languageName;
        dramas = new ArrayList<>();
    }

    public void addDrama( Drama drama) {
        dramas.add(drama);
    }
}
