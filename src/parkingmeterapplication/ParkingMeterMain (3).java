/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapplication;

import DBEntities.Carstb;
import DBServices.CarsService;
import Models.Payment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import parkingmeterapplication.admin.admin;

/**
 *
 * @author Gee
 */
public class ParkingMeterMain extends javax.swing.JFrame {

    /**
     * Creates new form ParkingMeterMain
     */
    CarsService carsService = new CarsService();
    Carstb car = new Carstb();

    Date timeEnter;
    Date timeExit;

    Payment payments[];
    private String receiptTxt;

    public ParkingMeterMain() {
        initComponents();

        this.car.setTimeenter((Date) spnTimeEnter.getValue());
        this.car.setTimeexit((Date) spnTimeExit.getValue());

        addPayments(); // method to populate the array of payments
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txaReceipt = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaPay = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        btnCalcPayment = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        spn20cents = new javax.swing.JSpinner();
        spn50cents = new javax.swing.JSpinner();
        spn1rand = new javax.swing.JSpinner();
        spn2rand = new javax.swing.JSpinner();
        spn5rand = new javax.swing.JSpinner();
        spn10rand = new javax.swing.JSpinner();
        spn20rand = new javax.swing.JSpinner();
        spn50rand = new javax.swing.JSpinner();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        spn100rand = new javax.swing.JSpinner();
        spn200rand = new javax.swing.JSpinner();
        spn10cents = new javax.swing.JSpinner();
        pnlEntryTime = new javax.swing.JPanel();
        spnTimeEnter = new javax.swing.JSpinner();
        pnlEntryTime1 = new javax.swing.JPanel();
        spnTimeExit = new javax.swing.JSpinner();
        label13 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txaReceipt.setColumns(20);
        txaReceipt.setFont(new java.awt.Font("Monospaced", 1, 33)); // NOI18N
        txaReceipt.setRows(5);
        jScrollPane2.setViewportView(txaReceipt);

        label1.setText("Amount to pay:");

        txaPay.setEditable(false);
        txaPay.setColumns(1);
        txaPay.setRows(1);
        jScrollPane1.setViewportView(txaPay);

        jButton1.setText("Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnCalcPayment.setText("Calculate payment");
        btnCalcPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcPaymentActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("How are you paying?"));

        spn20cents.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn20cents.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn20centsStateChanged(evt);
            }
        });

        spn50cents.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn50cents.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn50centsStateChanged(evt);
            }
        });

        spn1rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn1rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn1randStateChanged(evt);
            }
        });

        spn2rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn2rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn2randStateChanged(evt);
            }
        });

        spn5rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn5rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn5randStateChanged(evt);
            }
        });

        spn10rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn10rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn10randStateChanged(evt);
            }
        });

        spn20rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn20rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn20randStateChanged(evt);
            }
        });

        spn50rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn50rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn50randStateChanged(evt);
            }
        });

        label2.setText("R0,10");

        label3.setText("R0,20");

        label4.setText("R0,50");

        label5.setText("R1,00");

        label6.setText("R2,00");

        label7.setText("R5,00");

        label8.setText("R10,00");

        label9.setText("R20,00");

        label10.setText("R50,00");

        label11.setText("R100,00");

        label12.setText("R200,00");

        spn100rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn100rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn100randStateChanged(evt);
            }
        });

        spn200rand.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn200rand.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn200randStateChanged(evt);
            }
        });

        spn10cents.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        spn10cents.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn10centsStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn50cents, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn1rand, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn2rand, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn10rand, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn20rand, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn50rand, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn100rand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(spn200rand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(spn20cents, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn5rand, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spn10cents))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn10cents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn20cents)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spn50cents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spn1rand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spn2rand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn5rand)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn10rand)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn20rand)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn50rand)
                    .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn100rand)
                    .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spn200rand)
                    .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlEntryTime.setBorder(javax.swing.BorderFactory.createTitledBorder("Entry Time"));

        spnTimeEnter.setModel(new javax.swing.SpinnerDateModel());
        spnTimeEnter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTimeEnterStateChanged(evt);
            }
        });
        spnTimeEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnTimeEnterMouseClicked(evt);
            }
        });
        spnTimeEnter.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnTimeEnterPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlEntryTimeLayout = new javax.swing.GroupLayout(pnlEntryTime);
        pnlEntryTime.setLayout(pnlEntryTimeLayout);
        pnlEntryTimeLayout.setHorizontalGroup(
            pnlEntryTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntryTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnTimeEnter)
                .addContainerGap())
        );
        pnlEntryTimeLayout.setVerticalGroup(
            pnlEntryTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntryTimeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(spnTimeEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlEntryTime1.setBorder(javax.swing.BorderFactory.createTitledBorder("Exit Time"));

        spnTimeExit.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1548594374896L), null, java.util.Calendar.DAY_OF_MONTH));
        spnTimeExit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTimeExitStateChanged(evt);
            }
        });
        spnTimeExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnTimeExitMouseClicked(evt);
            }
        });
        spnTimeExit.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnTimeExitPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pnlEntryTime1Layout = new javax.swing.GroupLayout(pnlEntryTime1);
        pnlEntryTime1.setLayout(pnlEntryTime1Layout);
        pnlEntryTime1Layout.setHorizontalGroup(
            pnlEntryTime1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntryTime1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spnTimeExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlEntryTime1Layout.setVerticalGroup(
            pnlEntryTime1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntryTime1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(spnTimeExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        label13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label13.setText("Parking Meter Application");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlEntryTime1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(pnlEntryTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(pnlEntryTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(pnlEntryTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnCalcPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        setSize(new java.awt.Dimension(1207, 756));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcPaymentActionPerformed
        long comp = this.car.getTimeexit().getTime() - this.car.getTimeenter().getTime();

//        get Time defference code:
        
            /*    String d1 = "Entry Time";
		String d2 = "Exit Time";

		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(d1);
			d2 = format.parse(d2);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

		} catch (Exception e) {
			e.printStackTrace();
		}
*/
//        Convert to double
        double cost = cost(5);
        this.car.setAmount(cost);
        txaPay.setText("R " + this.car.getAmount());
    }//GEN-LAST:event_btnCalcPaymentActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed

        try {
            receipt();
            if (!(car.getAmount() != null && car.getAmount() > 0 && car.getAmountentered() >= car.getAmount())) {
                JOptionPane.showMessageDialog(rootPane, "Insert Amount Greater or Equal to Amount Owed");
                return;
            }
            this.carsService.carstbEntityManager.getTransaction().begin();
            this.car.setId(this.carsService.carstbList.size() + 1);
            this.carsService.carstbEntityManager.persist(car);
            this.carsService.carstbEntityManager.getTransaction().commit();
            this.carsService.carstbList.add(this.car);
            txaReceipt.setText(receiptTxt);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());;
            JOptionPane.showMessageDialog(rootPane, "Already Entered!");
        } finally {
            if (this.carsService.carstbEntityManager.isJoinedToTransaction()) {
                this.carsService.carstbEntityManager.close();
                this.carsService.carstbList.clear();
                this.carsService.carstbList.addAll(this.carsService.carstbList);
            }
        }

    }//GEN-LAST:event_btnPayActionPerformed

    private void spnTimeEnterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTimeEnterStateChanged
        this.car.setTimeenter((Date) spnTimeEnter.getValue());
    }//GEN-LAST:event_spnTimeEnterStateChanged

    private void spnTimeExitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTimeExitStateChanged
        this.car.setTimeexit((Date) spnTimeExit.getValue());
    }//GEN-LAST:event_spnTimeExitStateChanged

    private void spn10centsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn10centsStateChanged
        this.payments[0].setValue(Integer.parseInt(spn10cents.getValue().toString()));
    }//GEN-LAST:event_spn10centsStateChanged

    private void spn20centsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn20centsStateChanged
        this.payments[1].setValue(Integer.parseInt(spn20cents.getValue().toString()));
    }//GEN-LAST:event_spn20centsStateChanged

    private void spn50centsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn50centsStateChanged
        this.payments[2].setValue(Integer.parseInt(spn50cents.getValue().toString()));

    }//GEN-LAST:event_spn50centsStateChanged

    private void spn1randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn1randStateChanged
        this.payments[3].setValue(Integer.parseInt(spn1rand.getValue().toString()));
    }//GEN-LAST:event_spn1randStateChanged

    private void spn2randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn2randStateChanged
        this.payments[4].setValue(Integer.parseInt(spn2rand.getValue().toString()));
    }//GEN-LAST:event_spn2randStateChanged

    private void spn5randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn5randStateChanged
        this.payments[5].setValue(Integer.parseInt(spn5rand.getValue().toString()));
    }//GEN-LAST:event_spn5randStateChanged

    private void spn10randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn10randStateChanged
        this.payments[6].setValue(Integer.parseInt(spn10rand.getValue().toString()));
    }//GEN-LAST:event_spn10randStateChanged

    private void spn20randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn20randStateChanged
        this.payments[7].setValue(Integer.parseInt(spn20rand.getValue().toString()));
    }//GEN-LAST:event_spn20randStateChanged

    private void spn50randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn50randStateChanged
        this.payments[8].setValue(Integer.parseInt(spn50rand.getValue().toString()));
    }//GEN-LAST:event_spn50randStateChanged

    private void spn100randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn100randStateChanged
        this.payments[9].setValue(Integer.parseInt(spn100rand.getValue().toString()));
    }//GEN-LAST:event_spn100randStateChanged

    private void spn200randStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn200randStateChanged
        this.payments[10].setValue(Integer.parseInt(spn200rand.getValue().toString()));
    }//GEN-LAST:event_spn200randStateChanged

    private void spnTimeEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnTimeEnterMouseClicked

    }//GEN-LAST:event_spnTimeEnterMouseClicked

    private void spnTimeExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnTimeExitMouseClicked

    }//GEN-LAST:event_spnTimeExitMouseClicked

    private void spnTimeExitPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnTimeExitPropertyChange

    }//GEN-LAST:event_spnTimeExitPropertyChange

    private void spnTimeEnterPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnTimeEnterPropertyChange

    }//GEN-LAST:event_spnTimeEnterPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.carsService.getAdmin().dispose();
        new admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_btnResetActionPerformed
    //<editor-fold desc="Add Payments" defaultstate="collapsed">

    private void addPayments() {

        this.payments = new Payment[]{
            new Payment(0.10, 0),
            new Payment(0.20, 0),
            new Payment(0.50, 0),
            new Payment(1.00, 0),
            new Payment(2.00, 0),
            new Payment(5.00, 0),
            new Payment(10.00, 0),
            new Payment(20.00, 0),
            new Payment(50.00, 0),
            new Payment(100.00, 0),
            new Payment(200.00, 0),};
    }

    //</editor-fold>
    //    <editor-fold defaultstate="collapsed" desc="Get Time Cost">
    public double cost(int hours) {
        if (hours >= 0 && hours < 1) {
            return 0.0;
        }
        if (hours >= 1 && hours < 2) {
            return 5.00;
        }
        if (hours >= 2 && hours < 4) {
            return 8.00;
        }
        if (hours >= 4 && hours < 6) {
            return 11.00;
        }
        if (hours >= 6 && hours < 10) {
            return 14.00;
        }
        if (hours >= 10 && hours < 20) {
            return 25.00;
        }
        if (hours >= 20 && hours < 24) {
            return 35.00;
        }
        return 50.0;
    }

    //    </editor-fold>
    //    <editor-fold desc="Receipt" defaultstate="collapsed">
    void receipt() {
        double paymentAmount = 0;
        String deno = "Denominations:\n";
        for (int i = payments.length - 1; i >= 0; i--) {
            if (payments[i].getValue() > 0) {
                paymentAmount += payments[i].getSum();
                deno += payments[i] + "\n";
            }
            car.setAmount(cost(5));
            txaPay.setText("R " + this.car.getAmount());
            car.setTimeenter((Date)spnTimeEnter.getValue());
            car.setTimeexit((Date)spnTimeExit.getValue());
            car.setAmountentered(paymentAmount);
            car.setChange(car.getAmountentered() - car.getAmount());
            receiptTxt = car.toString() + "\n" + deno;
        }
    }
//    </editor-fold>
    //  <editor-fold desc="Clear()" defaultstate="collapsed">
    void clearAll(){
        this.car.reset();
        this.spn100rand.setValue(0);
        this.spn10cents.setValue(0);
        this.spn10rand.setValue(0);
        this.spn1rand.setValue(0);
        this.spn200rand.setValue(0);
        this.spn20cents.setValue(0);
        this.spn2rand.setValue(0);
        this.spn50cents.setValue(0);
        this.spn20rand.setValue(0);
        this.spn50rand.setValue(0);
        this.spn5rand.setValue(0);
        txaPay.setText("");
        txaReceipt.setText("");
    }
//</editor-fold>    
    /** 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParkingMeterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParkingMeterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParkingMeterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParkingMeterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParkingMeterMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcPayment;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JPanel pnlEntryTime;
    private javax.swing.JPanel pnlEntryTime1;
    private javax.swing.JSpinner spn100rand;
    private javax.swing.JSpinner spn10cents;
    private javax.swing.JSpinner spn10rand;
    private javax.swing.JSpinner spn1rand;
    private javax.swing.JSpinner spn200rand;
    private javax.swing.JSpinner spn20cents;
    private javax.swing.JSpinner spn20rand;
    private javax.swing.JSpinner spn2rand;
    private javax.swing.JSpinner spn50cents;
    private javax.swing.JSpinner spn50rand;
    private javax.swing.JSpinner spn5rand;
    private javax.swing.JSpinner spnTimeEnter;
    private javax.swing.JSpinner spnTimeExit;
    private javax.swing.JTextArea txaPay;
    private javax.swing.JTextArea txaReceipt;
    // End of variables declaration//GEN-END:variables
}
