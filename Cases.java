package com.example.licio.wakili2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cases {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("case_id")
    @Expose
    private String caseId;
    @SerializedName("plaintiff")
    @Expose
    private String plaintiff;
    @SerializedName("defendant")
    @Expose
    private String defendant;

    /**
     * No args constructor for use in serialization
     *
     */
    public Cases() {
    }

    /**
     *
     * @param id
     * @param caseId
     * @param plaintiff
     * @param defendant
     */
    public Cases(Integer id, String caseId, String plaintiff, String defendant) {
        super();
        this.id = id;
        this.caseId = caseId;
        this.plaintiff = plaintiff;
        this.defendant = defendant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getPlaintiff() {
        return plaintiff;
    }

    public void setPlaintiff(String plaintiff) {
        this.plaintiff = plaintiff;
    }

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

}
