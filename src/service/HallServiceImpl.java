package service;

import dao.HallDAO;
import dao.HallDAOImpl;
import db.HallDB;
import entity.Reservation;
import entity.Table;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class HallServiceImpl implements HallService {

    private HallDAO hallDAO = new HallDAOImpl();

    @Override
    public boolean checkStatusOfTablesInHall(Date date, List<HallDB> list) {
        return hallDAO.checkStatusOfTablesInHall(date, list);
    }

    @Override
    public HallDB getCheckedHall() {    //
        return hallDAO.getCheckedHall();
    }

    @Override
    public void notification1() {
        hallDAO.notification1();
    }

    @Override
    public void notification2() {
        hallDAO.notification2();
    }

    @Override
    public void showHall(HallDB hallDB) {
        hallDAO.showHall(hallDB);
    }

    @Override
    public String readCommand(String s) {
        return hallDAO.readCommand(s);
    }

    @Override
    public Date checkDate() throws ParseException {
        return hallDAO.checkDate();
    }

    @Override
    public Reservation madeNewReservation(Date date, String command) {
        return hallDAO.madeNewReservation(date, command);
    }

    @Override
    public List<Reservation> saveReservation(List<Reservation> list, Reservation reservation) {
        return hallDAO.saveReservation(list, reservation);
    }

    @Override
    public Table changeStatusOfTable(HallDB hallDB, Reservation reservation) {
        return hallDAO.changeStatusOfTable(hallDB, reservation);
    }

}
