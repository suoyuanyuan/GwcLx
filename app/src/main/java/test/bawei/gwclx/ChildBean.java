package test.bawei.gwclx;

/**
 * Created by 索园 on 2017/10/24.
 */

public class ChildBean {
    private String childName;
    private boolean checked;

    public ChildBean() {
    }

    public ChildBean(String childName, boolean checked) {
        this.childName = childName;
        this.checked = checked;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getChildName() {
        return childName;
    }

    public boolean isChecked() {
        return checked;
    }
}
