package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import jdbc.kioskapp.jdbcmanager;
import kioskapp.order.Order;
import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

@SuppressWarnings("serial")
public class FirstInterface extends JFrame implements Serializable{

	 double total = 0;
	JLabel sub_straw = new JLabel("");
	JLabel sub_fishfilletmeal = new JLabel("");
	JLabel sub_mcnuggetmeal = new JLabel("");
	JLabel sub_mcchickenmeal = new JLabel("");
	JLabel sub_dbcheese = new JLabel("");
	JLabel sub_ayam2 = new JLabel("");
	JLabel sub_bigmac = new JLabel("");
	JLabel sub_spicy = new JLabel("");
	JLabel sub_mcchicken = new JLabel("");
	JLabel sub_ayam5 = new JLabel("");
	private JTextField txtWelcomeToMc;
	private JLabel lblNewLabel;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField txtCredCard = new JTextField("");
	JLabel sub_fishofillet = new JLabel("");
	private JPanel cartpanel = new JPanel();
	JPanel ayamgoreng5 = new JPanel();
	JPanel mcchicken = new JPanel();
	JPanel spicymcdeluxe = new JPanel();
	JPanel mcnugget = new JPanel();
	JPanel doblecheeseburger = new JPanel();
	JPanel bigmac = new JPanel();
	JPanel fishofillet = new JPanel();
	JPanel mcchickenmeal = new JPanel();
	JPanel nuggetmeal = new JPanel();
	JPanel fishomeal = new JPanel();
	JPanel strawsundae = new JPanel();
	JPanel chocosundae = new JPanel();
	JPanel ayam2 = new JPanel();
	JLabel lbltotalprice = new JLabel("");
	JLabel sub_mcnugget = new JLabel("");
	JLabel sub_chocosundae = new JLabel("");
	private int qty[]= {0,0,0,0,0,0,0,0,0,0,0,0,0};
	private int item[]= {0,0,0,0,0,0,0,0,0,0,0,0,0};
	jdbcmanager db = new jdbcmanager();
	/**
	 * Create the application.
	 */
	Order order = new Order();
	/**
	 * Initialize the contents of the frame.
	 */
	public FirstInterface() {
		
/**
 * List declaration of panels
 */
		JPanel panel = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
/**
 * List disabling spinners -end-
 */
		

//		cartpanel.add(fishofillet);
//		cartpanel.add(ayamgoreng5);
//		cartpanel.add(mcchicken);
//		cartpanel.add(spicymcdeluxe);
//		cartpanel.add(bigmac);
//		cartpanel.add(ayam2);
//		cartpanel.add(mcnugget);
//		cartpanel.add(doblecheeseburger);
//		cartpanel.add(mcchickenmeal);
//		cartpanel.add(nuggetmeal);
//		cartpanel.add(fishomeal);
//		cartpanel.add(strawsundae);
//		cartpanel.add(chocosundae);

		
		setBounds(100, 100, 659, 455);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		

		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(-11, 49, 504, 231);
		
		panel.setLayout(null);
		
		txtWelcomeToMc = new JTextField();
		txtWelcomeToMc.setBounds(257, 21, 122, 31);
		panel.add(txtWelcomeToMc);
		txtWelcomeToMc.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtWelcomeToMc.setBackground(Color.ORANGE);
		txtWelcomeToMc.setText("Welcome To Mc Dey");
		txtWelcomeToMc.setColumns(10);
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 504, 193);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(FirstInterface.class.getResource("/MCDEY/erasgdfasdfg.png")));
		
		JButton btnTakeAway = new JButton("Take Away");
		btnTakeAway.setBounds(143, 208, 95, 23);
		panel.add(btnTakeAway);
		btnTakeAway.setBackground(SystemColor.activeCaption);
		btnTakeAway.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnEatIn = new JButton("Eat In");
		btnEatIn.setBounds(375, 208, 89, 23);
		panel.add(btnEatIn);
		btnEatIn.setBackground(SystemColor.activeCaption);
		btnEatIn.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(-1, 0, 634, 314);
		getContentPane().add(tabbedPane);
		
		
		btnEatIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.setOrderMode("Eat In");
				tabbedPane.setSelectedIndex(1);
			}
		});
		
		btnTakeAway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.setOrderMode("Take Away");
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		
		
		tabbedPane.addTab("Order Mode", null, panel, null);
/**
 * FirstInterface -start-
 */
/**
 *  FirstInterface -end-
 *  
 */
		
		
/**
 * ThirdInterface -start-
 */


		panel3.setBackground(new Color(0, 128, 0));
		panel3.setBounds(10, 9, 430, 241);
		
		panel3.setLayout(null);
		
		JTextField textFieldCart = new JTextField();
		txtCredCard.setBounds(517, 139, 86, 20);
		panel3.add(textFieldCart);
		textFieldCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textFieldCart.setColumns(10);
		
		JLabel lblNewLabel_111 = new JLabel("TOTAL PRICE: ");
		lblNewLabel_111.setBounds(501, 95, 102, 33);
		panel3.add(lblNewLabel_111);
		
		JLabel lblNewLabel_211 = new JLabel("Cart List:");
		lblNewLabel_211.setBounds(0, 0, 96, 14);
		panel3.add(lblNewLabel_211);
		
		JButton btnNewButton11 = new JButton("BACK");
		btnNewButton11.setBounds(501, 215, 118, 23);
		panel3.add(btnNewButton11);
		btnNewButton11.setBackground(new Color(255, 165, 0));
		
		JButton btnNewButton_1111 = new JButton("PAYMENT");
		btnNewButton_1111.setBounds(501, 189, 118, 23);
		panel3.add(btnNewButton_1111);
		btnNewButton_1111.setBackground(new Color(0, 255, 0));
		btnNewButton_1111.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(527, 11, 53, 45);
		panel3.add(lblNewLabel1);

		btnNewButton_1111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < qty.length; i++) {
					System.out.println(qty[i]);
				}
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnNewButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		JPanel panel2 = new JPanel();
		List<JPanel> panels = Arrays.asList(panel, panel2, panel3, panel4);
		
				panel2.setBackground(new Color(0, 128, 0));
				panel2.setBounds(10, 11, 582, 377);
				panel2.setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 10, 461, 343);
				panel2.add(scrollPane);
				
				
				JPanel panel1 = new JPanel();
				scrollPane.setViewportView(panel1);
				panel1.setBackground(new Color(240, 230, 140));
				panel1.setLayout(new MigLayout("", "[89px][30][20:30:100px,center][][]", "[23px][][][][][][][][][][][][][][][][][][]"));
				JLabel lblNewLabel_28 = new JLabel(" Ayam Goreng McD Spicy (2pcs) ");
				lblNewLabel_28.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 10));
				panel1.add(lblNewLabel_28, "flowy,cell 0 0,alignx trailing");
				
				JButton ayamgoreng2_btn = new JButton("");
				ayamgoreng2_btn.setBackground(new Color(255, 228, 181));
				ayamgoreng2_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ayamgoreng2_btn.isEnabled()) {
							ayamgoreng2_btn.setEnabled(false);
							cartpanel.add(ayam2);
							item[1]=2;
						}
						
					}
				});
				ayamgoreng2_btn.setToolTipText("");
				ayamgoreng2_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/2yam22.png")));
				panel1.add(ayamgoreng2_btn, "cell 0 0,alignx left,aligny top");
				
				JLabel lblNewLabel_1 = new JLabel("Ayam goreng McD Spicy (5pcs)");
				panel1.add(lblNewLabel_1, "flowy,cell 3 0");
				
				JButton ayamgoreng5_btn = new JButton("");
				ayamgoreng5_btn.setBackground(new Color(255, 228, 181));
				ayamgoreng5_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ayamgoreng5_btn.isEnabled()) {
							ayamgoreng5_btn.setEnabled(false);
							cartpanel.add(ayamgoreng5);
							item[2]=3;
						}
					}
				});
				ayamgoreng5_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/5ayamm.png")));
				panel1.add(ayamgoreng5_btn, "cell 3 0,alignx left,aligny baseline");
				
				JLabel lblNewLabel_15 = new JLabel("RM11.90");
				panel1.add(lblNewLabel_15, "cell 0 1");
				
				JLabel lblNewLabel_16 = new JLabel("RM30.20");
				panel1.add(lblNewLabel_16, "cell 3 1");
				
				JLabel lblNewLabel_2 = new JLabel(" McChicken");
				panel1.add(lblNewLabel_2, "cell 0 2");
				
				JLabel lblNewLabel_3 = new JLabel("Spicy Chicken McDeluxe");
				panel1.add(lblNewLabel_3, "cell 3 2");
				
				JButton mcchicken_btn = new JButton("");
				mcchicken_btn.setBackground(new Color(255, 228, 181));
				mcchicken_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(mcchicken_btn.isEnabled()) {
							mcchicken_btn.setEnabled(false);
							cartpanel.add(mcchicken);
							item[0]=1;
							
						}
					}
				});
				mcchicken_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/mcchicken.png")));
				panel1.add(mcchicken_btn, "cell 0 3");
				
				JButton spicymcdeluxe_btn = new JButton("");
				spicymcdeluxe_btn.setBackground(new Color(255, 228, 181));
				spicymcdeluxe_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/SpicyCMdeluxe.png")));
				spicymcdeluxe_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(spicymcdeluxe_btn.isEnabled()) {
							spicymcdeluxe_btn.setEnabled(false);
							cartpanel.add(spicymcdeluxe);
							item[3]=4;
						}

					}
				});
				panel1.add(spicymcdeluxe_btn, "cell 3 3");
				
						JButton mcnugget_btn = new JButton("");
						mcnugget_btn.setBackground(new Color(255, 228, 181));
						mcnugget_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/nugget.png")));
						mcnugget_btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(mcnugget_btn.isEnabled()) {
									mcnugget_btn.setEnabled(false);
									cartpanel.add(mcnugget);
									item[4]=5;
								}
							}
						});
						
						JLabel lblNewLabel_17 = new JLabel("RM8.10");
						panel1.add(lblNewLabel_17, "cell 0 4");
						
						JLabel lblNewLabel_18 = new JLabel("RM11.90");
						panel1.add(lblNewLabel_18, "cell 3 4");
						
						JLabel lblNewLabel_4 = new JLabel(" Chicken Mc Nuggets (6pcs)");
						panel1.add(lblNewLabel_4, "cell 0 5");
						
						JLabel lblNewLabel_5 = new JLabel("Double Cheeseburger");
						panel1.add(lblNewLabel_5, "cell 3 5");
						panel1.add(mcnugget_btn, "cell 0 6");
						
						JButton doublecheese_btn = new JButton("");
						doublecheese_btn.setBackground(new Color(255, 228, 181));
						doublecheese_btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(doublecheese_btn.isEnabled()){
									doublecheese_btn.setEnabled(false);
	
									cartpanel.add(doblecheeseburger);
									item[5]=6;
								}
							}
						});
						
						doublecheese_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/dabelchis.png")));
						panel1.add(doublecheese_btn, "cell 3 6");
						
						JButton bigmag_btn = new JButton("");
						bigmag_btn.setBackground(new Color(255, 228, 181));
						bigmag_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/bigmag.png")));
						bigmag_btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(bigmag_btn.isEnabled()){
									bigmag_btn.setEnabled(false);
									cartpanel.add(bigmac);
									item[6]=7;
								}
							}
						});
						
						JLabel lblNewLabel_19 = new JLabel("RM9.40");
						panel1.add(lblNewLabel_19, "cell 0 7");
						
						JLabel lblNewLabel_20 = new JLabel("RM9.45");
						panel1.add(lblNewLabel_20, "cell 3 7");
						
						JLabel lblNewLabel_6 = new JLabel(" Big Mac");
						panel1.add(lblNewLabel_6, "cell 0 8");
						
						JLabel lblNewLabel_7 = new JLabel("Fillet-O-Fish");
						panel1.add(lblNewLabel_7, "cell 3 8");
						panel1.add(bigmag_btn, "cell 0 9");
						
						JButton fishofillet_btn = new JButton("");
						fishofillet_btn.setBackground(new Color(255, 228, 181));
						fishofillet_btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(fishofillet_btn.isEnabled()){
									fishofillet_btn.setEnabled(false);
									cartpanel.add(fishofillet);
									item[7]=8;
								}
							}
						});
						
						fishofillet_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/fish0filet.png")));
						panel1.add(fishofillet_btn, "cell 3 9");
						
						JButton mcchickenset_btn = new JButton("");
						mcchickenset_btn.setBackground(new Color(255, 228, 181));
						mcchickenset_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/mcchickenset.png")));
						mcchickenset_btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e){	
							if(mcchickenset_btn.isEnabled()){
								mcchickenset_btn.setEnabled(false);
								cartpanel.add(mcchickenmeal);
								item[8]=9;
								}
							}
						});
						
						JLabel lblNewLabel_21 = new JLabel("RM10.40");
						panel1.add(lblNewLabel_21, "cell 0 10");
						
						JLabel lblNewLabel_22 = new JLabel("RM8.45");
						panel1.add(lblNewLabel_22, "cell 3 10");
						
						JLabel lblNewLabel_8 = new JLabel("Mcchicken Meal (Medium)");
						panel1.add(lblNewLabel_8, "cell 0 11");
						
						JLabel lblNewLabel_9 = new JLabel("");
						panel1.add(lblNewLabel_9, "flowx,cell 3 11");
						panel1.add(mcchickenset_btn, "cell 0 12");
						
						JButton nuggetset_btn = new JButton("");
						nuggetset_btn.setBackground(new Color(255, 228, 181));
						nuggetset_btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if(nuggetset_btn.isEnabled()){
									nuggetset_btn.setEnabled(false);
									cartpanel.add(nuggetmeal);
									item[9]=10;
								}
							}
						});
						
							
							nuggetset_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/nuggetsets.png")));
							panel1.add(nuggetset_btn, "cell 3 12");
							
							JButton fishset_btn = new JButton("");
							fishset_btn.setBackground(new Color(255, 228, 181));
							fishset_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/Fishsetss.png")));
							fishset_btn.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(fishset_btn.isEnabled()){
										fishset_btn.setEnabled(false);
										cartpanel.add(fishomeal);
										item[10]=11;
									}
								}
							});
							
							JLabel lblNewLabel_23 = new JLabel("RM13.20");
							panel1.add(lblNewLabel_23, "cell 0 13");
							
							JLabel lblNewLabel_24 = new JLabel("RM13.20");
							panel1.add(lblNewLabel_24, "cell 3 13");
							
							JLabel lblNewLabel_11 = new JLabel("Fillet-O-Fish Meal (Medium)");
							panel1.add(lblNewLabel_11, "cell 0 14");
							
							JLabel lblNewLabel_12 = new JLabel("Strawberry Sundae");
							panel1.add(lblNewLabel_12, "cell 3 14");
							panel1.add(fishset_btn, "cell 0 15");
							
							JButton straw_btn = new JButton("");
							straw_btn.setBackground(new Color(255, 228, 181));
							straw_btn.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(straw_btn.isEnabled()){
										straw_btn.setEnabled(false);
										cartpanel.add(strawsundae);
										item[11]=13;
										
									}
								}
							});
							
							straw_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/sanseseSTrw.png")));
							panel1.add(straw_btn, "cell 3 15");
							
							JLabel lblNewLabel_25 = new JLabel("RM13.00");
							panel1.add(lblNewLabel_25, "cell 0 16");
							
							JLabel lblNewLabel_26 = new JLabel("RM4.15");
							panel1.add(lblNewLabel_26, "cell 3 16");
							
							JLabel lblNewLabel_13 = new JLabel("Chocolate Sandae");
							panel1.add(lblNewLabel_13, "cell 0 17");
							
							JButton chocosundae_btn = new JButton("");
							chocosundae_btn.setBackground(new Color(255, 222, 173));
							chocosundae_btn.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									if(chocosundae_btn.isEnabled()){
										chocosundae_btn.setEnabled(false);
										cartpanel.add(chocosundae);
										item[12]=14;
									}
								}
							});
							chocosundae_btn.setIcon(new ImageIcon(ui.FirstInterface.class.getResource("/MCDEY/sandeaechockk.png")));
							panel1.add(chocosundae_btn, "flowy,cell 0 18");
							
							JLabel lblNewLabel_10 = new JLabel("Chicken McNuggets 6 pcs meal (Medium)");
							panel1.add(lblNewLabel_10, "cell 3 11");
							
							JLabel lblNewLabel_27 = new JLabel("RM4.15");
							panel1.add(lblNewLabel_27, "cell 0 18");
							
							
							
							JLabel lblNewLabel_14 = new JLabel("ADD TO CART");
							lblNewLabel_14.setBounds(139, 21, 110, 25);
							lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 15));
							panel1.add(lblNewLabel_14, "cell 2 18");
							scrollPane.getVerticalScrollBar().setUnitIncrement(23);
							tabbedPane.addTab("Menu", null, panel2, null);
							
							JButton btnNext = new JButton("NEXT");
							btnNext.setBackground(Color.GREEN);
							btnNext.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									tabbedPane.setSelectedIndex(2);
								}
							});
							btnNext.setBounds(534, 169, 85, 21);
							panel2.add(btnNext);
							
							JButton btnBack = new JButton("BACK");
							btnBack.setBackground(Color.ORANGE);
							btnBack.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									tabbedPane.setSelectedIndex(0);
								}
							});
							btnBack.setBounds(534, 201, 85, 21);
							panel2.add(btnBack);
		tabbedPane.addTab("Add to cart", null, panel3, null);
		
	
				
				JScrollPane scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(10, 25, 481, 252);
				scrollPane_1.getVerticalScrollBar().setUnitIncrement(23);
				panel3.add(scrollPane_1);
				
				scrollPane_1.setViewportView(cartpanel);
				cartpanel.setLayout(new GridLayout(13, 1, 0, 0));
				ayam2.setLayout(new MigLayout("", "[200][96px][96px][71px]", "[21px]"));
				
				
					
				JLabel lblAyamGorengMcd = new JLabel("Ayam Goreng McD Spicy (2pcs)");
				ayam2.add(lblAyamGorengMcd, "cell 0 0,alignx left,aligny center");
				
				
				JSpinner sp_ayam2 = new JSpinner();
				sp_ayam2.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[1] = (int) sp_ayam2.getValue();
						System.out.print(qty[1]);
						double subtotal = qty[1] * db.selectItem(2);
						sub_ayam2.setText(String.format("%2.2f", subtotal));
						updatePrice(sub_ayam2,sp_ayam2);
					}
				});
				ayam2.add(sp_ayam2, "cell 1 0");
				
				JButton btnNewButton_15 = new JButton("REMOVE");
				btnNewButton_15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(ayam2);
						ayamgoreng2_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						
					}
				});
				
				
				ayam2.add(sub_ayam2, "cell 2 0");
				ayam2.add(btnNewButton_15, "cell 3 0,alignx left,aligny top");
				
				//JPanel ayamgoreng5 = new JPanel();
				ayamgoreng5.setLayout(new MigLayout("", "[200][96px][96px][71px]", "[21px]"));
				
				JLabel lblAyamGorengMcd_1 = new JLabel("Ayam Goreng McD Spicy (5pcs)");
				ayamgoreng5.add(lblAyamGorengMcd_1, "cell 0 0,alignx left,aligny center");
				
				JSpinner sp_ayam5 = new JSpinner();
				ayamgoreng5.add(sp_ayam5, "cell 1 0,alignx left");
				
				JButton btnNewButton_15_1 = new JButton("REMOVE");
				btnNewButton_15_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(ayamgoreng5);
						ayamgoreng5_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[1]= 0;
						
					}
				});
				
				
				ayamgoreng5.add(sub_ayam5, "cell 2 0");
				ayamgoreng5.add(btnNewButton_15_1, "cell 3 0,alignx left,aligny top");
				
				sp_ayam5.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[2] = (int) sp_ayam5.getValue();
						double subtotal = qty[2] * db.selectItem(3);
						sub_ayam5.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(total));
						updatePrice(sub_ayam5,sp_ayam5);
					}
				});
				
				//JPanel mcchicken = new JPanel();
				mcchicken.setLayout(new MigLayout("", "[200][96px][96px][71px]", "[21px]"));
				
				JLabel lblAyamGorengMcd_2 = new JLabel("McChicken");
				mcchicken.add(lblAyamGorengMcd_2, "cell 0 0,alignx left,aligny center");
				
				
				JSpinner sp_mcchicken = new JSpinner();
				sp_mcchicken.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[0] = (int) sp_mcchicken.getValue();
						double subtotal = qty[0] * db.selectItem(1);
						sub_mcchicken.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_mcchicken, sp_mcchicken);
					}
				});
				mcchicken.add(sp_mcchicken, "cell 1 0");
				
				JButton btnNewButton_15_2 = new JButton("REMOVE");
				btnNewButton_15_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(mcchicken);
						mcchicken_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[0] = 0;
					}
				});
				
				
				mcchicken.add(sub_mcchicken, "cell 2 0");
				mcchicken.add(btnNewButton_15_2, "cell 3 0,alignx left,aligny top");
				
				//JPanel spicymcdeluxe = new JPanel();
				spicymcdeluxe.setLayout(new MigLayout("", "[200][96px][96px][71px]", "[21px]"));
				
				JLabel lblAyamGorengMcd_3 = new JLabel("Spicy Chicken Mc Deluxe ");
				spicymcdeluxe.add(lblAyamGorengMcd_3, "cell 0 0,alignx left,aligny center");
				
				
				JSpinner sp_spicy = new JSpinner();
				sp_spicy.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[3] = (int) sp_spicy.getValue();
						double subtotal = qty[3] * db.selectItem(4);
						sub_spicy.setText(String.format("%2.2f", subtotal));
						updatePrice(sub_spicy, sp_spicy);
					}
				});
				spicymcdeluxe.add(sp_spicy, "cell 1 0");
				
				JButton btnNewButton_15_3 = new JButton("REMOVE");
				btnNewButton_15_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(spicymcdeluxe);
						spicymcdeluxe_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[3] = 0;
					}
				});
				
				spicymcdeluxe.add(sub_spicy, "cell 2 0");
				spicymcdeluxe.add(btnNewButton_15_3, "cell 3 0,alignx left,aligny top");
				
				//JPanel mcnugget = new JPanel();
				
				mcnugget.setLayout(new MigLayout("", "[200][96px][96px][71px]", "[21px]"));
				
				JLabel lblAyamGorengMcd_4 = new JLabel("Chicken Mcnuggets (6pcs)");
				mcnugget.add(lblAyamGorengMcd_4, "cell 0 0,alignx left,aligny center");
				
				
				JSpinner sp_mcnugg = new JSpinner();
				sp_mcnugg.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[4] = (int) sp_mcnugg.getValue();
						double subtotal = qty[4] * db.selectItem(5);
						sub_mcnugget.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_mcnugget, sp_mcnugg);
					}
				});
				mcnugget.add(sp_mcnugg, "cell 1 0");
				
				JButton btnNewButton_15_4 = new JButton("REMOVE");
				btnNewButton_15_4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(mcnugget);
						mcnugget_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[4] = 0;
					}
				});
				
				
				mcnugget.add(sub_mcnugget, "cell 2 0");
				mcnugget.add(btnNewButton_15_4, "cell 3 0,alignx left,aligny top");
				
				//JPanel doblecheeseburger = new JPanel();
				
				doblecheeseburger.setLayout(new MigLayout("", "[200][96px][96px][71px]", "[21px][]"));
				JLabel lblAyamGorengMcd_5 = new JLabel("Double Cheeseburger");
				doblecheeseburger.add(lblAyamGorengMcd_5, "cell 0 0");
				
				JButton btnNewButton_15_5 = new JButton("REMOVE");
				btnNewButton_15_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(doblecheeseburger);
						doublecheese_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[5] = 0;
					}
				});
				
				
				JSpinner sp_dbcheese = new JSpinner();
				sp_dbcheese.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[5] = (int) sp_dbcheese.getValue();
						double subtotal = qty[5] * db.selectItem(6);
						sub_dbcheese.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_dbcheese, sp_dbcheese);
					}
				});
				doblecheeseburger.add(sp_dbcheese, "cell 1 0");
				
				
				doblecheeseburger.add(sub_dbcheese, "cell 2 0");
				doblecheeseburger.add(btnNewButton_15_5, "cell 3 0");
				
				JButton btnNewButton_15_6 = new JButton("REMOVE");
				btnNewButton_15_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(bigmac);
						bigmag_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[6] = 0;
					}
				});
				bigmac.setLayout(new MigLayout("", "[198px][96px][96px][71px][96px][96px][71px]", "[21px]"));
				
				//JPanel bigmac = new JPanel();
				
				JLabel lblAyamGorengMcd_6 = new JLabel("Big Mac");
				bigmac.add(lblAyamGorengMcd_6);
				bigmac.add(lblAyamGorengMcd_6);
				
				
				JSpinner spinner = new JSpinner();
				spinner.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[6] = (int) spinner.getValue();
						double subtotal = qty[6] * db.selectItem(7);
						sub_bigmac.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_bigmac, spinner);
					}
				});
				bigmac.add(spinner, "cell 1 0");
				
				
				bigmac.add(sub_bigmac, "cell 2 0");
				bigmac.add(btnNewButton_15_6, "cell 3 0,alignx left,aligny top");
				mcchickenmeal.setLayout(new MigLayout("", "[200][96px][100][]", "[21px]"));
				
				//JPanel mcchickenmeal = new JPanel();
				
				JLabel lblAyamGorengMcd_8 = new JLabel("McChicken Meal (Medium) ");
				mcchickenmeal.add(lblAyamGorengMcd_8, "cell 0 0,alignx left,aligny center");
				
				JButton btnNewButton_15_8 = new JButton("REMOVE");
				btnNewButton_15_8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(mcchickenmeal);
						mcchickenset_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[8] = 0;
					}
				});
				
				
				JSpinner sp_mcchickenmeal = new JSpinner();
				sp_mcchickenmeal.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[8] = (int) sp_mcchickenmeal.getValue();
						double subtotal = qty[8] * db.selectItem(9);
						sub_mcchickenmeal.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_mcchickenmeal, sp_mcchickenmeal);
					}
				});
				mcchickenmeal.add(sp_mcchickenmeal, "cell 1 0");
				
				
				mcchickenmeal.add(sub_mcchickenmeal, "cell 2 0");
				mcchickenmeal.add(btnNewButton_15_8, "cell 3 0,alignx left,aligny top");
				nuggetmeal.setLayout(new MigLayout("", "[200][96px][96][]", "[21px]"));
				
				//JPanel nuggetmeal = new JPanel();
				
				JLabel lblAyamGorengMcd_9 = new JLabel("Chicken Mc Nugget Meal 6pcs");
				nuggetmeal.add(lblAyamGorengMcd_9, "cell 0 0,alignx left,aligny center");
				
				JButton btnNewButton_15_9 = new JButton("REMOVE");
				btnNewButton_15_9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(nuggetmeal);
						nuggetset_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[9] = 0;
					}
				});
				
				
				JSpinner sp_nuggetmeal = new JSpinner();
				sp_nuggetmeal.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[9] = (int) sp_nuggetmeal.getValue();
						double subtotal = qty[9] * db.selectItem(10);
						sub_mcnuggetmeal.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_mcnuggetmeal, sp_nuggetmeal);
					}
				});
				nuggetmeal.add(sp_nuggetmeal, "cell 1 0");
				
				
				nuggetmeal.add(sub_mcnuggetmeal, "cell 2 0");
				nuggetmeal.add(btnNewButton_15_9, "cell 3 0,alignx left,aligny top");
				fishomeal.setLayout(new MigLayout("", "[200][96px][96][]", "[21px]"));
				
				//JPanel fishomeal = new JPanel();
				
				JLabel lblAyamGorengMcd_10 = new JLabel("Fish-O-Fillet Meal (Medium)");
				fishomeal.add(lblAyamGorengMcd_10, "cell 0 0,alignx left,aligny center");
				
				JButton btnNewButton_15_10 = new JButton("REMOVE");
				btnNewButton_15_10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(fishomeal);
						fishset_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[10] = 0;
					}
				});
				
				
				JSpinner sp_fishmeal = new JSpinner();
				sp_fishmeal.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[10] = (int) sp_fishmeal.getValue();
						double subtotal = qty[10] * db.selectItem(11);
						sub_fishfilletmeal.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_fishfilletmeal, sp_fishmeal);
					}
				});
				fishomeal.add(sp_fishmeal, "cell 1 0");
				

				fishomeal.add(sub_fishfilletmeal, "cell 2 0");
				fishomeal.add(btnNewButton_15_10, "cell 3 0,alignx left,aligny top");
				strawsundae.setLayout(new MigLayout("", "[200][96px][96][]", "[21px]"));
				
				//JPanel strawsundae = new JPanel();
				
				JLabel lblAyamGorengMcd_11 = new JLabel("Strawberry Sundae ");
				strawsundae.add(lblAyamGorengMcd_11, "cell 0 0,alignx left,aligny center");
				
				JButton btnNewButton_15_11 = new JButton("REMOVE");
				btnNewButton_15_11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(strawsundae);
						straw_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[11] = 0;
					}
				});
				
				
				JSpinner sp_straw = new JSpinner();
				sp_straw.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[11] = (int) sp_straw.getValue();
						double subtotal = qty[11] * db.selectItem(13);
						sub_straw.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_straw, sp_straw);
						
					}
				});
				strawsundae.add(sp_straw, "cell 1 0");
				
				strawsundae.add(sub_straw, "cell 2 0");
				strawsundae.add(btnNewButton_15_11, "cell 3 0,alignx left,aligny top");
				chocosundae.setLayout(new MigLayout("", "[200][96px][96][]", "[21px]"));
				
				//JPanel chocosundae = new JPanel();
				
				JLabel lblNewLabel_29 = new JLabel("Chocolate Sundae ");
				chocosundae.add(lblNewLabel_29, "cell 0 0,alignx left,aligny center");
				
				
				JSpinner sp_choco = new JSpinner();
				sp_choco.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						qty[12] = (int) sp_choco.getValue();
						double subtotal = qty[12] * db.selectItem(14);
						sub_chocosundae.setText(String.format("%2.2f", subtotal));
						//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
						updatePrice(sub_chocosundae, sp_choco);
					}
				});
				chocosundae.add(sp_choco, "cell 1 0");
				
								chocosundae.add(sub_chocosundae, "cell 2 0");
				
				JButton btnNewButton_16 = new JButton("REMOVE");
				chocosundae.add(btnNewButton_16, "cell 3 0,alignx left,aligny top");
				btnNewButton_16.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(chocosundae);
						chocosundae_btn.setEnabled(true);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[12] = 0;
					
					}
				});
				
				textField_15 = new JTextField();
				textField_15.setColumns(10);
				bigmac.add(textField_15, "cell 4 0,alignx left,aligny center");
				
				textField_16 = new JTextField();
				textField_16.setColumns(10);
				bigmac.add(textField_16, "cell 5 0,alignx left,aligny center");
				
				JButton bigmac_btn = new JButton("REMOVE");
				bigmac_btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						cartpanel.remove(bigmac);
						cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
						item[6] = 0;
					}
				});
				bigmac.add(bigmac_btn, "cell 6 0,alignx left,aligny top");
		fishofillet.setLayout(new MigLayout("", "[200][96][96px][71px]", "[21px]"));
		
		//JPanel fishofillet = new JPanel();
		
		JLabel lblAyamGorengMcd_7 = new JLabel("Fish-O-Fillet");
		fishofillet.add(lblAyamGorengMcd_7, "cell 0 0,alignx left,aligny center");
		
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				 qty[7] = (int) spinner_1.getValue();
				double subtotal = qty[7] * db.selectItem(8);
				sub_fishofillet.setText(Double.toString(subtotal));
				//lbltotalprice.setText(Double.toString(calcTotal(subtotal)));
				updatePrice(sub_fishofillet, spinner_1);
				
			}		
		});
		fishofillet.add(spinner_1, "cell 1 0,alignx left,aligny top");
		
		JButton btnNewButton_15_7 = new JButton("REMOVE");
		btnNewButton_15_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cartpanel.remove(fishofillet);
				fishofillet_btn.setEnabled(true);
				cartpanel.repaint();cartpanel.revalidate();cartpanel.invalidate();
				
				item[7] = 0;
				
			}
		});
		
		
		fishofillet.add(sub_fishofillet, "cell 2 0");
		fishofillet.add(btnNewButton_15_7, "cell 3 0,alignx left,aligny top");
		
		lbltotalprice.setBounds(501, 129, 102, 33);
		panel3.add(lbltotalprice);
		
		JLabel lblBigmac = new JLabel("Big Mac");
		
		
/**
 * ThirdInterface -end-
 */
		
		
/**
 * PaymentInterface -start-
 */
	
		panel4.setBackground(new Color(0, 128, 0));
		panel4.setBounds(10, 11, 414, 239);
		
		panel4.setLayout(null);
		
		
		txtCredCard.setBounds(65, 83, 153, 20);
		panel4.add(txtCredCard);
		txtCredCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtCredCard.setColumns(10);
		
		JButton btn = new JButton("1");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("1");
			}
		});
		btn.setBounds(65, 125, 44, 23);
		panel4.add(btn);
		
		JButton btn1 = new JButton("2");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("2");
			}
		});
		btn1.setBounds(120, 125, 44, 23);
		panel4.add(btn1);
		
		JButton btn2 = new JButton("3");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("3");
			}
		});
		btn2.setBounds(174, 125, 44, 23);
		panel4.add(btn2);
		
		JButton btn3 = new JButton("4");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("4");
			}
		});
		btn3.setBounds(65, 159, 44, 23);
		panel4.add(btn3);
		
		JButton btn4 = new JButton("5");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("5");
			}
		});
		btn4.setBounds(120, 159, 44, 23);
		panel4.add(btn4);
		
		JButton btn5 = new JButton("6");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("6");
			}
		});
		btn5.setBounds(174, 159, 44, 23);
		panel4.add(btn5);
		
		JButton btn6 = new JButton("7");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("7");
			}
		});
		btn6.setBounds(65, 193, 44, 23);
		panel4.add(btn6);
		
		JButton btn7 = new JButton("8");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("8");
			}
		});
		btn7.setBounds(120, 193, 44, 23);
		panel4.add(btn7);
		
		JButton btn8 = new JButton("9");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("9");
			}
		});
		btn8.setBounds(174, 193, 44, 23);
		panel4.add(btn8);
		
		JButton btn9 = new JButton("0");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToText("0");
			}
		});
		btn9.setBounds(120, 227, 44, 23);
		panel4.add(btn9);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\Acer\\Desktop\\MCDEY\\deydeydey.png"));
		lblImage.setBounds(217, 30, 207, 186);
		panel4.add(lblImage);
		
		JLabel lblImage2 = new JLabel("REF NUMBER: ");
		lblImage2.setIcon(new ImageIcon("C:\\Users\\Acer\\Desktop\\MCDEY\\OYEAH.png"));
		lblImage2.setBounds(217, 0, 108, 46);
		panel4.add(lblImage2);
		
		JButton btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				//setIntCreditCard(txtCredCard.getText());
				try {
					release();
				} catch (InterruptedException e1) {
					System.out.print("failed to sent. Too bad ");
					e1.printStackTrace();
				}
			}
		});
		
		btnPay.setBackground(new Color(255, 255, 0));
		btnPay.setBounds(335, 227, 89, 23);
		panel4.add(btnPay);
		
		JButton btnBackPay = new JButton("BACK");
		btnBackPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				
			}
		});
		btnBackPay.setBackground(new Color(255, 140, 0));
		btnBackPay.setBounds(236, 227, 89, 23);
		panel4.add(btnBackPay);
		tabbedPane.addTab("Credit Card Payment", null, panel4, null);
		
		
		
	}
	
	int count = 0;
	int numcount = 0;
	String creditcard ="";

	public void addToText(String num) {

		if(numcount == 16) {
			creditcard = "";
		}
		else {
			creditcard = creditcard + num;
			txtCredCard.setText(creditcard);
			numcount++;
		}
	}
	
	double haha;
	public double calcTotal(double fromCart) {
		haha=0;
		haha = haha + fromCart;
		return haha;
		
	}
	
	
	public void updatePrice(JLabel benda, JSpinner spin) {
		total = total + (Double.parseDouble(benda.getText())) / (int)spin.getValue();
		System.out.print(total + " ");
		lbltotalprice.setText(String.format("%2.2f", total));
	}
	

	public String getCreditCard() throws InterruptedException{
		waitForInput();
		return txtCredCard.getText();
		
	}
	int num;
	public void setIntCreditCard(String sent) {
		this.num = Integer.valueOf(sent);
		System.out.print(sent);
	}
	
	public int getIntCreditCard() {
		return num;
	}
	
	public String getMode() {
		return order.getOrderMode();
	}
	
	public String getTotalPrice() throws InterruptedException {
		return lbltotalprice.getText();
	}
	
	public int[] getQty() throws InterruptedException{
		return qty;
	}
	
	public int[] getID() throws InterruptedException {
		return item;
	}
	
	public void waitForInput() throws InterruptedException {
        synchronized(this) {
            wait();
        }
    }
	
	//release after button clicked
	public void release() throws InterruptedException {
        synchronized(this) {
            notifyAll();
        }
    }

	
}



