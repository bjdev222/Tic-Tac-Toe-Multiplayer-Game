package com.wolcnore.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0,flag=0;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,next,reset;
    TextView p1,p2;
    int pl1=0,pl2=0;
    private InterstitialAd interstitialAd;


    LinearLayout customAdView;
    NativeAdLayout nativeAdLayout;
    NativeAd nativeAd;
    private AdView adView2;
    private CardView adView;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);


        next = findViewById(R.id.next);
        reset = findViewById(R.id.reset);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(interstitialAd.isAdLoaded() && interstitialAd!=null)
                {
                    interstitialAd.show();

                }



                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                flag6 = 0;
                flag7 = 0;
                flag8 = 0;
                flag9 = 0;
                flag = 0;
                count = 0;
                b1.setText(" ");
                b2.setText(" ");
                b3.setText(" ");
                b4.setText(" ");
                b5.setText(" ");
                b6.setText(" ");
                b7.setText(" ");
                b8.setText(" ");
                b9.setText(" ");


            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(interstitialAd.isAdLoaded() && interstitialAd!=null)
                {
                    interstitialAd.show();

                }

                flag1 = 0;
                flag2 = 0;
                flag3 = 0;
                flag4 = 0;
                flag5 = 0;
                flag6 = 0;
                flag7 = 0;
                flag8 = 0;
                flag9 = 0;
                flag = 0;
                count = 0;
                b1.setText(" ");
                b2.setText(" ");
                b3.setText(" ");
                b4.setText(" ");
                b5.setText(" ");
                b6.setText(" ");
                b7.setText(" ");
                b8.setText(" ");
                b9.setText(" ");
                pl1 = 0;
                pl2 = 0;
                p1.setText(Integer.toString(pl1));
                p2.setText(Integer.toString(pl2));

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag1 == 0 && flag == 0) {
                    count++;
                    flag1 = 1;
                    if (count % 2 == 0) {
                        b1.setText("O");
                    } else {
                        b1.setText("X");
                    }
                    check();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag2 == 0 && flag == 0) {
                    count++;
                    flag2 = 1;
                    if (count % 2 == 0) {
                        b2.setText("O");
                    } else {
                        b2.setText("X");
                    }
                    check();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag3 == 0 && flag == 0) {
                    count++;
                    flag3 = 1;
                    if (count % 2 == 0) {
                        b3.setText("O");
                    } else {
                        b3.setText("X");
                    }
                    check();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag4 == 0 && flag == 0) {
                    count++;
                    flag4 = 1;
                    if (count % 2 == 0) {
                        b4.setText("O");
                    } else {
                        b4.setText("X");
                    }
                    check();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag5 == 0 && flag == 0) {
                    count++;
                    flag5 = 1;
                    if (count % 2 == 0) {
                        b5.setText("O");
                    } else {
                        b5.setText("X");
                    }
                    check();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag6 == 0 && flag == 0) {
                    count++;
                    flag6 = 1;
                    if (count % 2 == 0) {
                        b6.setText("O");
                    } else {
                        b6.setText("X");
                    }
                    check();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag7 == 0 && flag == 0) {
                    count++;
                    flag7 = 1;
                    if (count % 2 == 0) {
                        b7.setText("O");
                    } else {
                        b7.setText("X");
                    }
                    check();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag8 == 0 && flag == 0) {
                    count++;
                    flag8 = 1;
                    if (count % 2 == 0) {
                        b8.setText("O");
                    } else {
                        b8.setText("X");
                    }
                    check();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag9 == 0 && flag == 0) {
                    count++;
                    flag9 = 1;
                    if (count % 2 == 0) {
                        b9.setText("O");
                    } else {
                        b9.setText("X");
                    }
                    check();
                }
            }
        });
        nativeAdLayout = findViewById(R.id.nativeAdLayout);

        nativeAd = new NativeAd(this, "384859859506216_384860149506187");

        NativeAdListener nativeAdListener = new NativeAdListener() {

            @Override
            public void onMediaDownloaded(Ad ad) {

            }

            @Override
            public void onError(Ad ad, AdError adError) {

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Race condition, load() called again before last ad was displayed
                if (nativeAd == null || nativeAd != ad) {
                    return;
                }
                // Inflate Native Ad into Container
                inflateAd(nativeAd);
            }

            @Override
            public void onAdClicked(Ad ad) {

            }

            @Override
            public void onLoggingImpression(Ad ad) {

            }

        };

        // Request an ad
        nativeAd.loadAd(
                nativeAd.buildLoadAdConfig()
                        .withAdListener(nativeAdListener)
                        .build());


        //interstitial
        interstitialAd = new InterstitialAd(this, "384859859506216_384860682839467");
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback

            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback

            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed

                // Show the ad
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback

            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback

            }
        };

        // For auto play video ads, it's recommended to load the ad
        // at least 30 seconds before it is shown
        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());
    }

        private void inflateAd(NativeAd nativeAd) {

        nativeAd.unregisterView();

        // Add the Ad view into the ad container.

        nativeAdLayout = findViewById(R.id.nativeAdLayout);

        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        // Inflate the Ad view.  The layout referenced should be the one you created in the last step.
        adView = (CardView) inflater.inflate(R.layout.test, nativeAdLayout, false);
        CardView adView = (CardView) inflater.inflate(R.layout.test, nativeAdLayout, false);

        nativeAdLayout.addView(adView);

        // Add the AdOptionsView
        LinearLayout adChoicesContainer = findViewById(R.id.ad_choices_container);
        AdOptionsView adOptionsView = new AdOptionsView(MainActivity.this, nativeAd, nativeAdLayout);
        adChoicesContainer.removeAllViews();
        adChoicesContainer.addView(adOptionsView, 0);

        // Create native UI using the ad metadata.
        MediaView nativeAdIcon = adView.findViewById(R.id.native_ad_icon);
        TextView nativeAdTitle = adView.findViewById(R.id.native_ad_title);
        MediaView nativeAdMedia = adView.findViewById(R.id.native_ad_media);
        TextView nativeAdSocialContext = adView.findViewById(R.id.native_ad_social_context);
        TextView nativeAdBody = adView.findViewById(R.id.native_ad_body);
        TextView sponsoredLabel = adView.findViewById(R.id.native_ad_sponsored_label);
        Button nativeAdCallToAction = adView.findViewById(R.id.native_ad_call_to_action);

        // Set the Text.
        nativeAdTitle.setText(nativeAd.getAdvertiserName());
        nativeAdBody.setText(nativeAd.getAdBodyText());
        nativeAdSocialContext.setText(nativeAd.getAdSocialContext());
        nativeAdCallToAction.setVisibility(nativeAd.hasCallToAction() ? View.VISIBLE : View.INVISIBLE);
        nativeAdCallToAction.setText(nativeAd.getAdCallToAction());
        sponsoredLabel.setText(nativeAd.getSponsoredTranslation());

        // Create a list of clickable views
        List<View> clickableViews = new ArrayList<>();
        clickableViews.add(nativeAdTitle);
        clickableViews.add(nativeAdCallToAction);

        // Register the Title and CTA button to listen for clicks.
        nativeAd.registerViewForInteraction(
                adView, nativeAdMedia, nativeAdIcon, clickableViews);
    }

    private void check() {

        //FOR HORIZONTLE

        if(b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));


        }
        if(b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));

        }
        if(b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));

        }

        //PLAYER 1
        if(b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));


        }
        if(b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));


        }
        if(b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));


        }

        //FOR VERTICLE
        if(b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));

        }
        if(b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));

        }
        if(b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));

        }
        //PLAYER 1

        if(b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));


        }
        if(b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));


        }
        if(b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));


        }



        // FOR CROSS
        if(b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));

        }
        if(b3.getText().toString().equals("O") && b5.getText().toString().equals("O") && b7.getText().toString().equals("O") )
        {
            Toast.makeText(this, "Player2 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl2++;
            p2.setText(Integer.toString(pl2));

        }


        //PLAYER 1

        if(b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));

        }
        if(b3.getText().toString().equals("X") && b5.getText().toString().equals("X") && b7.getText().toString().equals("X") )
        {
            Toast.makeText(this, "Player1 is win", Toast.LENGTH_SHORT).show();
            flag=1; // to disable other button
            pl1++;
            p1.setText(Integer.toString(pl1));


        }



    }

}