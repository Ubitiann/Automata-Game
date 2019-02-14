package com.example.abc.mygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Play extends AppCompatActivity {
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15;
    FA dfa1 = new FA();
    int[] a = new int[16];
    int cur = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);
        bt10 = (Button) findViewById(R.id.bt10);
        bt11 = (Button) findViewById(R.id.bt11);
        bt12 = (Button) findViewById(R.id.bt12);
        bt13 = (Button) findViewById(R.id.bt13);
        bt14 = (Button) findViewById(R.id.bt14);
        bt15 = (Button) findViewById(R.id.bt15);

        //bt0.setOnClickListener(this);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 0);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                    finish();
                } else {
                    switch (cur) {


                        case 0:
                            BUT();
                            bt0.setText("1");
                            bt15.setText("G");
                            break;

                        case 1:
                            BUT();
                            bt1.setText("1");
                            bt15.setText("G");
                            break;

                        case 4:
                            BUT();
                            bt4.setText("1");
                            bt15.setText("G");
                            break;

                        default:
                            break;

                    }
                }
            }
        });


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 1);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {


                        case 0:
                            BUT();
                            bt0.setText("1");
                            bt15.setText("G");
                            break;

                        case 1:
                            BUT();
                            bt1.setText("1");
                            bt15.setText("G");
                            break;

                        case 2:
                            BUT();
                            bt2.setText("1");
                            bt15.setText("G");
                            break;

                        case 5:
                            BUT();
                            bt5.setText("1");
                            bt15.setText("G");
                            break;

                        default:
                            break;

                    }
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 2);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 1:
                            BUT();
                            bt1.setText("1");
                            bt15.setText("G");
                            break;

                        case 2:
                            BUT();
                            bt2.setText("1");
                            bt15.setText("G");
                            break;

                        case 3:
                            BUT();
                            bt3.setText("1");
                            bt15.setText("G");
                            break;

                        case 6:
                            BUT();
                            bt6.setText("1");
                            bt15.setText("G");
                            break;

                        default:
                            break;

                    }
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 3);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 2:
                            BUT();
                            bt2.setText("1");
                            bt15.setText("G");
                            break;

                        case 3:
                            BUT();
                            bt3.setText("1");
                            bt15.setText("G");
                            break;
                        case 7:
                            BUT();
                            bt7.setText("1");
                            bt15.setText("G");
                            break;

                        default:
                            break;


                    }
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 4);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 0:
                            BUT();
                            bt0.setText("1");
                            bt15.setText("G");
                            break;
                        case 4:
                            BUT();
                            bt4.setText("1");
                            bt15.setText("G");
                            break;
                        case 5:
                            BUT();
                            bt5.setText("1");
                            bt15.setText("G");
                            break;

                        case 8:
                            BUT();
                            bt8.setText("1");
                            bt15.setText("G");
                            break;

                        default:
                            break;

                    }
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 5);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 1:
                            BUT();
                            bt1.setText("1");
                            bt15.setText("G");
                            break;
                        case 4:
                            BUT();
                            bt4.setText("1");
                            bt15.setText("G");
                            break;
                        case 5:
                            BUT();
                            bt5.setText("1");
                            bt15.setText("G");
                            break;
                        case 6:
                            BUT();
                            bt6.setText("1");
                            bt15.setText("G");
                            break;
                        case 9:
                            BUT();
                            bt9.setText("1");
                            bt15.setText("G");
                            break;
                        default:

                            break;
                    }
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 6);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 2:
                            BUT();
                            bt2.setText("1");
                            bt15.setText("G");
                            break;
                        case 5:
                            BUT();
                            bt5.setText("1");
                            bt15.setText("G");
                            break;
                        case 6:
                            BUT();
                            bt6.setText("1");
                            bt15.setText("G");
                            break;
                        case 7:
                            BUT();
                            bt7.setText("1");
                            bt15.setText("G");
                            break;
                        case 10:
                            BUT();
                            bt10.setText("1");
                            bt15.setText("G");

                        default:


                    }
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 7);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 3:
                            BUT();
                            bt3.setText("1");
                            bt15.setText("G");
                            break;
                        case 7:
                            BUT();
                            bt7.setText("1");
                            bt15.setText("G");
                            break;
                        case 6:
                            BUT();
                            bt6.setText("1");
                            bt15.setText("G");
                            break;
                        case 11:
                            BUT();
                            bt11.setText("1");
                            bt15.setText("G");
                            break;
                        default:

                            break;
                    }
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 8);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 4:
                            BUT();
                            bt4.setText("1");
                            bt15.setText("G");
                            break;
                        case 8:
                            BUT();
                            bt8.setText("1");
                            bt15.setText("G");
                            break;
                        case 9:
                            BUT();
                            bt9.setText("1");
                            bt15.setText("G");
                            break;
                        case 12:
                            BUT();
                            bt12.setText("1");
                            bt15.setText("G");
                            break;
                        default:
                            break;

                    }
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 9);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 5:
                            BUT();
                            bt5.setText("1");
                            break;


                        case 8:
                            BUT();
                            bt8.setText("1");
                            bt15.setText("G");
                            break;
                        case 9:
                            BUT();
                            bt9.setText("1");
                            bt15.setText("G");
                            break;
                        case 10:
                            BUT();
                            bt10.setText("1");
                            bt15.setText("G");
                            break;
                        case 13:
                            BUT();
                            bt13.setText("1");
                            bt15.setText("G");
                            break;
                        default:
                            break;

                    }
                }
            }
        });

        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 10);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 9:
                            BUT();
                            bt9.setText("1");
                            bt15.setText("G");
                            break;
                        case 6:
                            BUT();
                            bt6.setText("1");
                            bt15.setText("G");
                            break;
                        case 10:
                            BUT();
                            bt10.setText("1");
                            bt15.setText("G");
                            break;
                        case 11:
                            BUT();
                            bt11.setText("1");
                            bt15.setText("G");
                            break;
                        case 14:
                            BUT();
                            bt14.setText("1");
                            bt15.setText("G");
                            break;
                        default:
                            break;

                    }
                }
            }
        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 11);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 7:
                            BUT();
                            bt7.setText("1");
                            bt15.setText("G");
                            break;
                        case 10:
                            BUT();
                            bt10.setText("1");
                            bt15.setText("G");
                            break;
                        case 11:
                            BUT();
                            bt11.setText("1");
                            bt15.setText("G");
                            break;
                        case 15:
                            BUT();
                            bt15.setText("1");
                            bt15.setText("G");
                            break;

                        default:
                            break;

                    }
                }
            }
        });

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 12);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 8:
                            BUT();
                            bt8.setText("1");
                            bt15.setText("G");
                            break;
                        case 12:
                            BUT();
                            bt12.setText("1");
                            bt15.setText("G");
                            break;
                        case 13:
                            BUT();
                            bt13.setText("1");
                            bt15.setText("G");
                            break;
                        default:
                            break;

                    }
                }
            }
        });

        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 13);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 9:
                            BUT();
                            bt9.setText("1");
                            bt15.setText("G");
                            break;
                        case 12:
                            BUT();
                            bt12.setText("1");
                            bt15.setText("G");
                            break;
                        case 13:
                            BUT();
                            bt13.setText("1");
                            bt15.setText("G");
                            break;
                        case 14:
                            BUT();
                            bt14.setText("1");
                            bt15.setText("G");
                            break;
                        default:
                            break;

                    }
                }
            }
        });

        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cur = dfa1.transition(cur, 14);
                if (cur == -1) {
                    Intent intent2 = new Intent(Play.this, invalid_move.class);
                    startActivity(intent2);
                } else {
                    switch (cur) {

                        case 13:
                            BUT();
                            bt13.setText("1");
                            bt15.setText("G");
                            break;
                        case 10:
                            BUT();
                            bt10.setText("1");
                            bt15.setText("G");
                            break;
                        case 14:
                            BUT();
                            bt14.setText("1");
                            bt15.setText("G");
                            break;
                        case 15:
                            BUT();
                            bt15.setText("1");
                            bt15.setText("G");
                            break;
                        default:

                            break;
                    }
                }
            }
        });

        bt15.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {

                                        cur = dfa1.transition(cur, 15);
                                        if (cur == -1) {
                                            Intent intent2 = new Intent(Play.this, invalid_move.class);
                                            startActivity(intent2);
                                        } else {
                                            switch (cur) {

                                                case 15:
                                                    BUT();
                                                    bt15.setText("1");
                                                    Intent intent2=new Intent(Play.this,Activity_Goal.class);
                                                    startActivity(intent2);
                                                    break;

                                                default:
                                                    break;
                                            }
                                        }
                                    }
                                }
        );

    }

    public void BUT() {
        bt0.setText("");
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        bt10.setText("");
        bt11.setText("");
        bt12.setText("");
        bt13.setText("");
        bt14.setText("");
        bt15.setText("");
    }


}
