package test.bawei.gwclx;

/**
 * Created by 索园 on 2017/10/24.
 */

public class GroupBean {
    private String groupName;
    private boolean checked;

    public GroupBean() {
    }

    public GroupBean(String groupName, boolean checked) {
        this.groupName = groupName;
        this.checked = checked;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getGroupName() {
        return groupName;
    }

    public boolean isChecked() {
        return checked;
    }
}
