
package Matrices;


public class sr4x4 extends javax.swing.JFrame {
   

    public sr4x4() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b23 = new javax.swing.JTextField();
        b31 = new javax.swing.JTextField();
        c31 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        b32 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c32 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        b11 = new javax.swing.JTextField();
        c33 = new javax.swing.JTextField();
        b33 = new javax.swing.JTextField();
        b13 = new javax.swing.JTextField();
        b12 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        b22 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        b21 = new javax.swing.JTextField();
        a33 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        a34 = new javax.swing.JTextField();
        a14 = new javax.swing.JTextField();
        a24 = new javax.swing.JTextField();
        b34 = new javax.swing.JTextField();
        b14 = new javax.swing.JTextField();
        b24 = new javax.swing.JTextField();
        a44 = new javax.swing.JTextField();
        a43 = new javax.swing.JTextField();
        a42 = new javax.swing.JTextField();
        a41 = new javax.swing.JTextField();
        b43 = new javax.swing.JTextField();
        b44 = new javax.swing.JTextField();
        b41 = new javax.swing.JTextField();
        b42 = new javax.swing.JTextField();
        c34 = new javax.swing.JTextField();
        c14 = new javax.swing.JTextField();
        c24 = new javax.swing.JTextField();
        c42 = new javax.swing.JTextField();
        c43 = new javax.swing.JTextField();
        c44 = new javax.swing.JTextField();
        c41 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton3.setText("Sumar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Restar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Matriz A");

        jLabel2.setText("Matriz B");

        jLabel3.setText("Resultado");

        jButton2.setText("Limpiar datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Diagonal Secundaria");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Diagonal Principal");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(c41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(88, 88, 88))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(c44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(a21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(a31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(b31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(a14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(a24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(a44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(b44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int [][] a = new int[4][4];
        
        a[0][0]=Integer.parseInt(a11.getText());
        a[0][1]=Integer.parseInt(a12.getText());
        a[0][2]=Integer.parseInt(a13.getText());
        a[0][3]=Integer.parseInt(a14.getText());
        a[1][0]=Integer.parseInt(a21.getText());
        a[1][1]=Integer.parseInt(a22.getText());
        a[1][2]=Integer.parseInt(a23.getText());
        a[1][3]=Integer.parseInt(a24.getText());
        a[2][0]=Integer.parseInt(a31.getText());
        a[2][1]=Integer.parseInt(a32.getText());
        a[2][2]=Integer.parseInt(a33.getText());
        a[2][3]=Integer.parseInt(a34.getText());
        a[3][0]=Integer.parseInt(a41.getText());
        a[3][1]=Integer.parseInt(a42.getText());
        a[3][2]=Integer.parseInt(a43.getText());
        a[3][3]=Integer.parseInt(a44.getText());
     
        int [][] b = new int[4][4];
        
        b[0][0]=Integer.parseInt(b11.getText());
        b[0][1]=Integer.parseInt(b12.getText());
        b[0][2]=Integer.parseInt(b13.getText());
        b[0][3]=Integer.parseInt(b14.getText());
        b[1][0]=Integer.parseInt(b21.getText());
        b[1][1]=Integer.parseInt(b22.getText());
        b[1][2]=Integer.parseInt(b23.getText());
        b[1][3]=Integer.parseInt(b24.getText());
        b[2][0]=Integer.parseInt(b31.getText());
        b[2][1]=Integer.parseInt(b32.getText());
        b[2][2]=Integer.parseInt(b33.getText());
        b[2][3]=Integer.parseInt(b34.getText());
        b[3][0]=Integer.parseInt(b41.getText());
        b[3][1]=Integer.parseInt(b42.getText());
        b[3][2]=Integer.parseInt(b43.getText());
        b[3][3]=Integer.parseInt(b44.getText());
       
        int [][] c = new int[4][4];
       
        c[0][0] = a[0][0] +  b[0][0]; 
        c[0][1]=  a[0][1] +  b[0][1]; 
        c[0][2]=  a[0][2] +  b[0][2];
        c[0][3]=  a[0][3] +  b[0][3];
        c[1][0]=  a[1][0] +  b[1][0]; 
        c[1][1]=  a[1][1] +  b[1][1]; 
        c[1][2]=  a[1][2] +  b[1][2];
        c[1][3]=  a[1][3] +  b[1][3];
        c[2][0]=  a[2][0] +  b[2][0]; 
        c[2][1]=  a[2][1] +  b[2][1]; 
        c[2][2]=  a[2][2] +  b[2][2]; 
        c[2][3]=  a[2][3] +  b[2][3];
        c[3][0]=  a[3][0] +  b[3][0];
        c[3][1]=  a[3][1] +  b[3][1];
        c[3][2]=  a[3][2] +  b[3][2];
        c[3][3]=  a[3][3] +  b[3][3];
        
        c11.setText(String.valueOf (c[0][0]));
        c12.setText(String.valueOf (c[0][1]));
        c13.setText(String.valueOf (c[0][2]));
        c14.setText(String.valueOf (c[0][3]));
        c21.setText(String.valueOf (c[1][0]));
        c22.setText(String.valueOf (c[1][1]));
        c23.setText(String.valueOf (c[1][2]));
        c24.setText(String.valueOf (c[1][3]));
        c31.setText(String.valueOf (c[2][0]));
        c32.setText(String.valueOf (c[2][1]));
        c33.setText(String.valueOf (c[2][2]));
        c34.setText(String.valueOf (c[2][3]));
        c41.setText(String.valueOf (c[3][0]));
        c42.setText(String.valueOf (c[3][1]));
        c43.setText(String.valueOf (c[3][2]));
        c44.setText(String.valueOf (c[3][3]));
        

       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int [][] a = new int[4][4];
        
        a[0][0]=Integer.parseInt(a11.getText());
        a[0][1]=Integer.parseInt(a12.getText());
        a[0][2]=Integer.parseInt(a13.getText());
        a[0][3]=Integer.parseInt(a14.getText());
        a[1][0]=Integer.parseInt(a21.getText());
        a[1][1]=Integer.parseInt(a22.getText());
        a[1][2]=Integer.parseInt(a23.getText());
        a[1][3]=Integer.parseInt(a24.getText());
        a[2][0]=Integer.parseInt(a31.getText());
        a[2][1]=Integer.parseInt(a32.getText());
        a[2][2]=Integer.parseInt(a33.getText());
        a[2][3]=Integer.parseInt(a34.getText());
        a[3][0]=Integer.parseInt(a41.getText());
        a[3][1]=Integer.parseInt(a42.getText());
        a[3][2]=Integer.parseInt(a43.getText());
        a[3][3]=Integer.parseInt(a44.getText());
     
        int [][] b = new int[4][4];
        
        b[0][0]=Integer.parseInt(b11.getText());
        b[0][1]=Integer.parseInt(b12.getText());
        b[0][2]=Integer.parseInt(b13.getText());
        b[0][3]=Integer.parseInt(b14.getText());
        b[1][0]=Integer.parseInt(b21.getText());
        b[1][1]=Integer.parseInt(b22.getText());
        b[1][2]=Integer.parseInt(b23.getText());
        b[1][3]=Integer.parseInt(b24.getText());
        b[2][0]=Integer.parseInt(b31.getText());
        b[2][1]=Integer.parseInt(b32.getText());
        b[2][2]=Integer.parseInt(b33.getText());
        b[2][3]=Integer.parseInt(b34.getText());
        b[3][0]=Integer.parseInt(b41.getText());
        b[3][1]=Integer.parseInt(b42.getText());
        b[3][2]=Integer.parseInt(b43.getText());
        b[3][3]=Integer.parseInt(b44.getText());
       
        int [][] c = new int[4][4];
       
        c[0][0] = a[0][0] -  b[0][0]; 
        c[0][1]=  a[0][1] -  b[0][1]; 
        c[0][2]=  a[0][2] -  b[0][2];
        c[0][3]=  a[0][3] -  b[0][3];
        c[1][0]=  a[1][0] -  b[1][0]; 
        c[1][1]=  a[1][1] -  b[1][1]; 
        c[1][2]=  a[1][2] -  b[1][2];
        c[1][3]=  a[1][3] -  b[1][3];
        c[2][0]=  a[2][0] -  b[2][0]; 
        c[2][1]=  a[2][1] -  b[2][1]; 
        c[2][2]=  a[2][2] -  b[2][2]; 
        c[2][3]=  a[2][3] -  b[2][3];
        c[3][0]=  a[3][0] -  b[3][0];
        c[3][1]=  a[3][1] -  b[3][1];
        c[3][2]=  a[3][2] -  b[3][2];
        c[3][3]=  a[3][3] -  b[3][3];
        
        c11.setText(String.valueOf (c[0][0]));
        c12.setText(String.valueOf (c[0][1]));
        c13.setText(String.valueOf (c[0][2]));
        c14.setText(String.valueOf (c[0][3]));
        c21.setText(String.valueOf (c[1][0]));
        c22.setText(String.valueOf (c[1][1]));
        c23.setText(String.valueOf (c[1][2]));
        c24.setText(String.valueOf (c[1][3]));
        c31.setText(String.valueOf (c[2][0]));
        c32.setText(String.valueOf (c[2][1]));
        c33.setText(String.valueOf (c[2][2]));
        c34.setText(String.valueOf (c[2][3]));
        c41.setText(String.valueOf (c[3][0]));
        c42.setText(String.valueOf (c[3][1]));
        c43.setText(String.valueOf (c[3][2]));
        c44.setText(String.valueOf (c[3][3]));
   

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuS opera = new MenuS();
       opera.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       
        a11.setText(null);
        a12.setText(null);
        a13.setText(null);
        a14.setText(null);
        a21.setText(null);
        a22.setText(null);
        a23.setText(null);
        a24.setText(null);
        a31.setText(null);
        a32.setText(null);
        a33.setText(null);
        a34.setText(null);
        a41.setText(null);
        a42.setText(null);
        a43.setText(null);
        a44.setText(null);
        
        b11.setText(null);
        b12.setText(null);
        b13.setText(null);
        b14.setText(null);
        b21.setText(null);
        b22.setText(null);
        b23.setText(null);
        b24.setText(null);
        b31.setText(null);
        b32.setText(null);
        b33.setText(null);
        b34.setText(null);
        b41.setText(null);
        b42.setText(null);
        b43.setText(null);
        b44.setText(null);
        
        c11.setText(null);
        c12.setText(null);
        c13.setText(null);
        c14.setText(null);
        c21.setText(null);
        c22.setText(null);
        c23.setText(null);
        c24.setText(null);
        c31.setText(null);
        c32.setText(null);
        c33.setText(null);
        c34.setText(null);
        c41.setText(null);
        c42.setText(null);
        c43.setText(null);
        c44.setText(null);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        a12.setText(null);
        a13.setText(null);
        a14.setText(null);
        a21.setText(null);
        a24.setText(null);
        a23.setText(null);
        a31.setText(null);
        a32.setText(null);
        a34.setText(null);
        a41.setText(null);
        a42.setText(null);
        a43.setText(null);
        
        b12.setText(null);
        b13.setText(null);
        b14.setText(null);
        b21.setText(null);
        b24.setText(null);
        b23.setText(null);
        b31.setText(null);
        b32.setText(null);
        b34.setText(null);
        b41.setText(null);
        b42.setText(null);
        b43.setText(null);
        
        
   
        c12.setText(null);
        c13.setText(null);
        c14.setText(null);
        c21.setText(null);
        c24.setText(null);
        c23.setText(null);
        c31.setText(null);
        c32.setText(null);
        c34.setText(null);
        c41.setText(null);
        c42.setText(null);
        c43.setText(null);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        a11.setText(null);
        a12.setText(null);
        a13.setText(null);
        
        a21.setText(null);
        a22.setText(null);
        
        a24.setText(null);
        a31.setText(null);
        
        a33.setText(null);
        a34.setText(null);
        
        a42.setText(null);
        a43.setText(null);
        a44.setText(null);
        
        b11.setText(null);
        b12.setText(null);
        b13.setText(null);
        
        b21.setText(null);
        b22.setText(null);
        
        b24.setText(null);
        b31.setText(null);
        
        b33.setText(null);
        b34.setText(null);
        
        b42.setText(null);
        b43.setText(null);
        b44.setText(null);
        
        c11.setText(null);
        c12.setText(null);
        c13.setText(null);
        
        c21.setText(null);
        c22.setText(null);
        
        c24.setText(null);
        c31.setText(null);
        
        c33.setText(null);
        c34.setText(null);
        
        c42.setText(null);
        c43.setText(null);
        c44.setText(null);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sr4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sr4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sr4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sr4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sr4x4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a14;
    private javax.swing.JTextField a21;
    private javax.swing.JTextField a22;
    private javax.swing.JTextField a23;
    private javax.swing.JTextField a24;
    private javax.swing.JTextField a31;
    private javax.swing.JTextField a32;
    private javax.swing.JTextField a33;
    private javax.swing.JTextField a34;
    private javax.swing.JTextField a41;
    private javax.swing.JTextField a42;
    private javax.swing.JTextField a43;
    private javax.swing.JTextField a44;
    private javax.swing.JTextField b11;
    private javax.swing.JTextField b12;
    private javax.swing.JTextField b13;
    private javax.swing.JTextField b14;
    private javax.swing.JTextField b21;
    private javax.swing.JTextField b22;
    private javax.swing.JTextField b23;
    private javax.swing.JTextField b24;
    private javax.swing.JTextField b31;
    private javax.swing.JTextField b32;
    private javax.swing.JTextField b33;
    private javax.swing.JTextField b34;
    private javax.swing.JTextField b41;
    private javax.swing.JTextField b42;
    private javax.swing.JTextField b43;
    private javax.swing.JTextField b44;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c14;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JTextField c23;
    private javax.swing.JTextField c24;
    private javax.swing.JTextField c31;
    private javax.swing.JTextField c32;
    private javax.swing.JTextField c33;
    private javax.swing.JTextField c34;
    private javax.swing.JTextField c41;
    private javax.swing.JTextField c42;
    private javax.swing.JTextField c43;
    private javax.swing.JTextField c44;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeto(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
