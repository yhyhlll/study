package org.example.project.model.service;

import org.example.project.model.domain.Architect;
import org.example.project.model.domain.Designer;
import org.example.project.model.domain.Employee;
import org.example.project.model.domain.Programmer;

public class TeamService {
    //    给memberid自动赋值的基数
    private static int counter = 1;
    //    表示开发团队中最大成员数
    private final int MAX_MEMBER = 5;
    //    开发团队数组
    private Programmer[] team = new Programmer[MAX_MEMBER];
    //    记录开发团队中的人数
    private int total;

    //    返回当前团队的所有对象
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];

        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    //向团队中添加成员
    public void addMember(Employee e) throws TeamException {
        if (total > MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");

        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("不是开发人员，无法添加");
        }

        Status status = ((Programmer) e).getStatus();
        switch (status) {
            case BUSY -> {
                throw new TeamException("该员工已是某团队成员");
            }
            default -> {
                ((Programmer) e).setStatus(Status.BUSY);
            }
        }
        int memberId = ((Programmer) e).getId();
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == memberId) {
                throw new TeamException("该员工已在开发团队中");
            }
            team[i].setStatus(Status.BUSY);
        }
        int ArcCnt = 0;
        int DesCnt = 0;
        int ProCnt = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                ArcCnt++;
            } else if (team[i] instanceof Designer) {
                DesCnt++;
            } else if (team[i] instanceof Programmer) {
                ProCnt++;
            }
        }

        if (e instanceof Architect) {
            if (ArcCnt > 1) {
                throw new TeamException("该团队中只能有一名架构师");
            }
        } else if (e instanceof Designer) {
            if (DesCnt > 2) {
                throw new TeamException("该团队中只能有2名设计师");
            }
        } else if (e instanceof Programmer) {
            if (ProCnt > 3) {
                throw new TeamException("该团队中只能有3名程序员");
            }
        }

        ((Programmer) e).setMemberId(counter++);
        ((Programmer) e).setStatus(Status.BUSY);
        team[total++] = (Programmer) e;
    }

    //删除成员
    public void removeMember(int memberId) throws TeamException {
        int i;
        for (i = 0; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total) {

            throw new TeamException("该id不存在");
        }
        for (int j = i; j < total - 1; i++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;

    }
}
