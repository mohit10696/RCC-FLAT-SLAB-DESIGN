package com.example.rccflatslabdesign;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class FlatSlabRectangularCol extends AppCompatActivity {

    //Material property
    double Fck = 20;
    double Fy = 415;

    //PRELIMINARY DIMENSION
    double interior_longer_span = 6;
    double interior_shorter_span = 5;
    double size_of_col_length = 1000;
    double size_of_col_breadth = 400;
    double live_load = 4;
    double floor_finish = 3;
    double height_of_col = 3.8;

    //DEPTH OF SLAB
    double assume_pt = 0.40;
    double M_F;
    double depth;
    double Provide_overall_depth;
    double assume_theta = 10;
    double clear_cover = 20;
    double depth_without_effective_cover;
    double dl_for_longer_side;
    double ds_for_shorter_side;

    //load Calculation
    double Self_weight;
    double Floor_finish;
    double Live_load_1;
    double load_total;
    double Factored_total_load;
    double Dead_load;
    double Live_load_2;

    //CALCULATION OF STIFFNESSES AND αc
    double along_longer_kc;
    double along_longer_ks;
    double along_longer_alphac;
    double along_shorter_kc;
    double along_shorter_ks;
    double along_shorter_alphac;

    //CHECK FOR CORRECTION DUE TO PATTERN LOADING
    double ratio_ll_dl;

    //TOTAL DESIGN MOMENTS
    double along_longer_direction_ln;
    double along_longer_direction_Mol;
    double along_shorter_direction_ln;
    double along_shorter_direction_Mol;

    //COLUMN STRIPS AND MIDDLE STRIPS
    double along_long_span_col_1;
    double along_long_span_col_2;
    double along_long_span_width_col;
    double along_long_span_width_mid;
    double along_short_span_col_1;
    double along_short_span_col_2;
    double along_short_span_width_col;
    double along_short_span_width_mid;

    //provide reinfrocemnet
    double along_long_span_mol;
    double along_long_span_d;
    double along_long_span_col_width;
    double along_long_span_mid_width;
    double along_long_span_mu_col_plus;
    double along_long_span_mu_col_minus;
    double along_long_span_mu_mid_plus;
    double along_long_span_mu_mid_minus;
    double along_long_span_ptpersontage_col_plus;
    double along_long_span_ptpersontage_col_minus;
    double along_long_span_ptpersontage_mid_plus;
    double along_long_span_ptpersontage_mid_minus;
    double along_long_span_takept_col_plus;
    double along_long_span_takept_col_minus;
    double along_long_span_takept_mid_plus;
    double along_long_span_takept_mid_minus;
    double along_long_span_totalast_col_plus;
    double along_long_span_totalast_col_minus;
    double along_long_span_totalast_mid_plus;
    double along_long_span_totalast_mid_minus;
    double along_long_span_astbyM_col_plus;
    double along_long_span_astbyM_col_minus;
    double along_long_span_astbyM_mid_plus;
    double along_long_span_astbyM_mid_minus;
    double along_long_span_provided_col_plus;
    double along_long_span_provided_col_minus;
    double along_long_span_provided_mid_plus;
    double along_long_span_provided_mid_minus;
    double along_long_span_finalAst_col_plus;
    double along_long_span_finalAst_col_minus;
    double along_long_span_finalAst_mid_plus;
    double along_long_span_finalAst_mid_minus;

    double along_short_span_mol;
    double along_short_span_d;
    double along_short_span_D;
    double along_short_span_col_width;
    double along_short_span_mid_width;
    double along_short_span_mu_col_plus;
    double along_short_span_mu_col_minus;
    double along_short_span_mu_mid_plus;
    double along_short_span_mu_mid_minus;
    double along_short_span_ptpersontage_col_plus;
    double along_short_span_ptpersontage_col_minus;
    double along_short_span_ptpersontage_mid_plus;
    double along_short_span_ptpersontage_mid_minus;
    double along_short_span_takept_col_plus;
    double along_short_span_takept_col_minus;
    double along_short_span_takept_mid_plus;
    double along_short_span_takept_mid_minus;
    double along_short_span_totalast_col_plus;
    double along_short_span_totalast_col_minus;
    double along_short_span_totalast_mid_plus;
    double along_short_span_totalast_mid_minus;
    double along_short_span_astbyM_col_plus;
    double along_short_span_astbyM_col_minus;
    double along_short_span_astbyM_mid_plus;
    double along_short_span_astbyM_mid_minus;
    double along_short_span_provided_col_plus;
    double along_short_span_provided_col_minus;
    double along_short_span_provided_mid_plus;
    double along_short_span_provided_mid_minus;
    double along_short_span_finalAst_col_plus;
    double along_short_span_finalAst_col_minus;
    double along_short_span_finalAst_mid_plus;
    double along_short_span_finalAst_mid_minus;

    //CHECK FOR TWO WAY SHEAR
    double d2;
    double Vu;
    double b0;
    double tv;
    double ks;
    double Takeks;
    double tc;
    double tc_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_slab_rectangular_col);
        calDepthOfSlab();
        loadCalculation();
        stiffnessCalculation();
        checkForCorrection();
        totalDesignMoment();
        ColumnStripsAndMiddleStrips();
        provideReinfrocement();
        checkForTwoWayShear();
    }


    private void calDepthOfSlab() {
        M_F = Math.round(1 / (1 + (0.625 * Math.log10(assume_pt))) * 10) / 10.0;
        Log.e("M F", "calDepthOfSlab: " + String.valueOf(M_F));
        depth = Math.round(Math.max((interior_longer_span * 1000) / (26 * M_F), 125) * 100.0) / 100.0;
        Log.e("depth", "calDepthOfSlab: " + String.valueOf(depth));
        Provide_overall_depth = centralStore.roundup(depth, -2);
        Log.e("Provide_overall_depth", "calDepthOfSlab: " + String.valueOf(Provide_overall_depth));
        depth_without_effective_cover = Provide_overall_depth - (assume_theta / 2) - clear_cover;
        Log.e("depth_without_effective", "calDepthOfSlab: " + String.valueOf(depth_without_effective_cover));
        dl_for_longer_side = depth_without_effective_cover;
        Log.e("dl_for_longer_side", "calDepthOfSlab: " + String.valueOf(dl_for_longer_side));
        ds_for_shorter_side = dl_for_longer_side - assume_theta;
        Log.e("ds_for_shorter_side", "calDepthOfSlab: " + String.valueOf(ds_for_shorter_side));
    }

    private void loadCalculation() {
        Self_weight = (Provide_overall_depth / 1000) * 25;
        Floor_finish = floor_finish;
        Live_load_1 = live_load;
        load_total = Self_weight + Floor_finish + Live_load_1;
        Factored_total_load = 1.5 * load_total;
        Dead_load = Self_weight + Floor_finish;
        Live_load_2 = live_load;
    }

    private void stiffnessCalculation() {
        along_longer_kc = Math.round((4 * 2 * 100000 * size_of_col_breadth * size_of_col_length * size_of_col_length * size_of_col_length) / (height_of_col * 1000 * 12) * 100) / 100.0;
        along_longer_ks = Math.round((4 * 2 * 100000 * interior_shorter_span * 1000 * Provide_overall_depth * Provide_overall_depth * Provide_overall_depth) / (interior_longer_span * 1000 * 12) * 100) / 100.0;
        along_longer_alphac = Math.round(along_longer_kc / along_longer_ks * 100) / 100.0;
        Log.e("along_longer_alphac", "calDepthOfSlab: " + String.valueOf(along_longer_alphac));
        along_shorter_kc = Math.round((4 * 2 * 100000 * size_of_col_length * size_of_col_breadth * size_of_col_breadth * size_of_col_breadth) / (height_of_col * 1000 * 12) * 100) / 100.0;
        along_shorter_ks = Math.round((4 * 2 * 100000 * interior_longer_span * 1000 * Provide_overall_depth * Provide_overall_depth * Provide_overall_depth) / (interior_shorter_span * 1000 * 12) * 100) / 100.0;
        along_shorter_alphac = Math.round(along_shorter_kc / along_shorter_ks * 100) / 100.0;
        Log.e("along_shorter_alphac", "calDepthOfSlab: " + String.valueOf(along_shorter_alphac));
    }

    private void checkForCorrection() {
        ratio_ll_dl = Live_load_2 / Dead_load;
        Log.e("ratio_ll_dl", "calDepthOfSlab: " + String.valueOf(ratio_ll_dl));
        if (ratio_ll_dl <= 0.5) {
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "NOT OK, CORRECTION REQUIRED", Toast.LENGTH_SHORT).show();
        }
    }

    private void totalDesignMoment() {
        along_longer_direction_ln = interior_longer_span - (size_of_col_length / 1000);
        along_longer_direction_Mol = Math.round(Factored_total_load * interior_shorter_span * Math.pow(along_longer_direction_ln, 2) / 8 * 100) / 100.0;
        Log.e("along_longer_direction", "calDepthOfSlab: " + String.valueOf(along_longer_direction_Mol));
        along_shorter_direction_ln = interior_shorter_span - (size_of_col_breadth / 1000);
        along_shorter_direction_Mol = Math.round(Factored_total_load * interior_longer_span * Math.pow(along_shorter_direction_ln, 2) / 8 * 100) / 100.0;
        Log.e("along_shorter_direction", "calDepthOfSlab: " + String.valueOf(along_shorter_direction_Mol));
    }

    private void ColumnStripsAndMiddleStrips() {
        along_long_span_col_1 = 2 * (0.25 * interior_longer_span * 1000);
        along_long_span_col_2 = 2 * (0.25 * interior_shorter_span * 1000);
        along_long_span_width_col = Math.min(along_long_span_col_1, along_long_span_col_2);
        along_long_span_width_mid = (interior_shorter_span * 1000) - along_long_span_width_col;
        Log.e("along_long_span_width", "calDepthOfSlab: " + String.valueOf(along_long_span_width_mid));
        along_short_span_col_1 = 2 * (0.25 * interior_shorter_span * 1000);
        along_short_span_col_2 = 2 * (0.25 * interior_longer_span * 1000);
        along_short_span_width_col = Math.min(along_short_span_col_1, along_short_span_col_2);
        along_short_span_width_mid = (interior_longer_span * 1000) - along_short_span_width_col;
        Log.e("along_short_span_width", "calDepthOfSlab: " + String.valueOf(along_short_span_width_mid));
    }

    private void provideReinfrocement() {
        along_long_span_mol = along_longer_direction_Mol;
        along_long_span_d = dl_for_longer_side;
        along_long_span_col_width = along_long_span_width_col;
        along_long_span_mid_width = along_long_span_width_mid;
        along_long_span_mu_col_plus = 0.65 * 0.75 * along_long_span_mol;
        along_long_span_mu_col_minus = 0.35 * 0.6 * along_long_span_mol;
        along_long_span_mu_mid_plus = (0.65 * along_long_span_mol) - along_long_span_mu_col_plus;
        along_long_span_mu_mid_minus = (0.35 * along_long_span_mol) - along_long_span_mu_col_minus;
        along_long_span_ptpersontage_col_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_col_plus * 1000000) / (Fck * along_long_span_col_width * along_long_span_d * along_long_span_d))));
        along_long_span_ptpersontage_col_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_col_minus * 1000000) / (Fck * along_long_span_col_width * along_long_span_d * along_long_span_d))));
        along_long_span_ptpersontage_mid_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_mid_plus * 1000000) / (Fck * along_long_span_col_width * along_long_span_d * along_long_span_d))));
        along_long_span_ptpersontage_mid_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_mid_minus * 1000000) / (Fck * along_long_span_col_width * along_long_span_d * along_long_span_d))));
        along_long_span_takept_col_plus = Math.max(along_long_span_ptpersontage_col_plus, 0.12);
        along_long_span_takept_col_minus = Math.max(along_long_span_ptpersontage_col_minus, 0.12);
        along_long_span_takept_mid_plus = Math.max(along_long_span_ptpersontage_mid_plus, 0.12);
        along_long_span_takept_mid_minus = Math.max(along_long_span_ptpersontage_mid_minus, 0.12);
        along_long_span_totalast_col_plus = (along_long_span_takept_col_plus / 100) * along_long_span_col_width * along_long_span_d;
        along_long_span_totalast_col_minus = (along_long_span_takept_col_minus / 100) * along_long_span_col_width * along_long_span_d;
        along_long_span_totalast_mid_plus = (along_long_span_takept_mid_plus / 100) * along_long_span_mid_width * along_long_span_d;
        along_long_span_totalast_mid_minus = (along_long_span_takept_mid_minus / 100) * along_long_span_mid_width * along_long_span_d;
        along_long_span_astbyM_col_plus = along_long_span_totalast_col_plus / (along_long_span_col_width / 1000);
        along_long_span_astbyM_col_minus = along_long_span_totalast_col_minus / (along_long_span_col_width / 1000);
        along_long_span_astbyM_mid_plus = along_long_span_totalast_mid_plus / (along_long_span_mid_width / 1000);
        along_long_span_astbyM_mid_minus = along_long_span_totalast_mid_minus / (along_long_span_mid_width / 1000);
        along_long_span_provided_col_plus = centralStore.ROUNDDOWN((((PI / 4) * pow(16, 2)) / along_long_span_astbyM_col_plus) * 1000, -1);
        along_long_span_provided_col_minus = centralStore.ROUNDDOWN((((PI / 4) * pow(10, 2)) / along_long_span_astbyM_col_minus) * 1000, -1);
        along_long_span_provided_mid_plus = centralStore.ROUNDDOWN((((PI / 4) * pow(8, 2)) / along_long_span_astbyM_mid_plus) * 1000, -1);
        along_long_span_provided_mid_minus = centralStore.ROUNDDOWN((((PI / 4) * pow(8, 2)) / along_long_span_astbyM_mid_minus) * 1000, -1);
        along_long_span_finalAst_col_plus = Math.round((((PI / 4) * Math.pow(16, 2)) / along_long_span_provided_col_plus) * 1000);
        along_long_span_finalAst_col_minus = Math.round((((PI / 4) * Math.pow(10, 2)) / along_long_span_provided_col_minus) * 1000);
        along_long_span_finalAst_mid_plus = Math.round((((PI / 4) * Math.pow(8, 2)) / along_long_span_provided_mid_plus) * 1000);
        along_long_span_finalAst_mid_minus = Math.round((((PI / 4) * Math.pow(8, 2)) / along_long_span_provided_mid_minus) * 1000);


        along_short_span_mol = along_shorter_direction_Mol;
        along_short_span_d = ds_for_shorter_side;
        along_short_span_D = Provide_overall_depth;

        along_short_span_col_width = along_short_span_width_col;
        along_short_span_mid_width = along_short_span_width_mid;

        along_short_span_mu_col_plus = 0.65 * 0.75 * along_short_span_mol;
        along_short_span_mu_col_minus = 0.35 * 0.6 * along_short_span_mol * 1.01;
        along_short_span_mu_mid_plus = (0.65 * along_short_span_mol) - along_short_span_mu_col_plus;
        along_short_span_mu_mid_minus = (0.35 * along_short_span_mol * 1.01) - along_short_span_mu_col_minus;


        along_short_span_ptpersontage_col_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_col_plus * 1000000) / (Fck * along_short_span_col_width * along_short_span_d * along_short_span_d))));
        along_short_span_ptpersontage_col_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_col_minus * 1000000) / (Fck * along_short_span_col_width * along_short_span_d * along_short_span_d))));
        along_short_span_ptpersontage_mid_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_mid_plus * 1000000) / (Fck * along_short_span_col_width * along_short_span_d * along_short_span_d))));
        along_short_span_ptpersontage_mid_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_mid_minus * 1000000) / (Fck * along_short_span_col_width * along_short_span_d * along_short_span_d))));


        along_short_span_ptpersontage_col_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_col_plus * 1000000) / (Fck * along_short_span_col_width * along_short_span_d * along_short_span_d))));
        along_short_span_ptpersontage_col_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_col_minus * 1000000) / (Fck * along_short_span_col_width * along_short_span_d * along_short_span_d))));
        along_short_span_ptpersontage_mid_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_mid_plus * 1000000) / (Fck * along_short_span_mid_width * along_short_span_d * along_short_span_d))));
        along_short_span_ptpersontage_mid_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_mid_minus * 1000000) / (Fck * along_short_span_mid_width * along_short_span_d * along_short_span_d))));


        along_short_span_takept_col_plus = Math.max(along_short_span_ptpersontage_col_plus, 0.12);
        along_short_span_takept_col_minus = Math.max(along_short_span_ptpersontage_col_minus, 0.12);
        along_short_span_takept_mid_plus = Math.max(along_short_span_ptpersontage_mid_plus, 0.12);
        along_short_span_takept_mid_minus = Math.max(along_short_span_ptpersontage_mid_minus, 0.12);


        along_short_span_totalast_col_plus = (along_short_span_takept_col_plus / 100) * along_short_span_col_width * along_short_span_d;
        along_short_span_totalast_col_minus = (along_short_span_takept_col_minus / 100) * along_short_span_col_width * along_short_span_d;
        along_short_span_totalast_mid_plus = (along_short_span_takept_mid_plus / 100) * along_short_span_mid_width * along_short_span_D;
        along_short_span_totalast_mid_minus = (along_short_span_takept_mid_minus / 100) * along_short_span_mid_width * along_short_span_D;

//        along_short_span_totalast_mid_plus = (along_short_span_takept_mid_plus/100) * along_short_span_mid_width *J95;
//        along_short_span_totalast_mid_minus = (along_short_span_takept_mid_minus / 100) * along_short_span_mid_width * along_short_span_d;


        along_short_span_astbyM_col_plus = along_short_span_totalast_col_plus / (along_short_span_col_width / 1000);
        along_short_span_astbyM_col_minus = along_short_span_totalast_col_minus / (along_short_span_col_width / 1000);
        along_short_span_astbyM_mid_plus = along_short_span_totalast_mid_plus / (along_short_span_mid_width / 1000);
        along_short_span_astbyM_mid_minus = along_short_span_totalast_mid_minus / (along_short_span_mid_width / 1000);


        along_short_span_provided_col_plus = centralStore.ROUNDDOWN((((PI / 4) * pow(16, 2)) / along_short_span_astbyM_col_plus) * 1000, -1);
        along_short_span_provided_col_minus = centralStore.ROUNDDOWN((((PI / 4) * pow(10, 2)) / along_short_span_astbyM_col_minus) * 1000, -1);
        along_short_span_provided_mid_plus = centralStore.ROUNDDOWN((((PI / 4) * pow(8, 2)) / along_short_span_astbyM_mid_plus) * 1000, -1);
        along_short_span_provided_mid_minus = centralStore.ROUNDDOWN((((PI / 4) * pow(8, 2)) / along_short_span_astbyM_mid_minus) * 1000, -1);

        along_short_span_finalAst_col_plus = Math.round((((PI / 4) * Math.pow(16, 2)) / along_short_span_provided_col_plus) * 1000);
        along_short_span_finalAst_col_minus = Math.round((((PI / 4) * Math.pow(10, 2)) / along_short_span_provided_col_minus) * 1000);
        along_short_span_finalAst_mid_plus = Math.round((((PI / 4) * Math.pow(8, 2)) / along_short_span_provided_mid_plus) * 1000);
        along_short_span_finalAst_mid_minus = Math.round((((PI / 4) * Math.pow(8, 2)) / along_short_span_provided_mid_minus) * 1000);

        Log.e("_short_span_width--1", "calDepthOfSlab: " + String.valueOf(along_short_span_finalAst_col_plus));
        Log.e("_short_span_width--2", "calDepthOfSlab: " + String.valueOf(along_short_span_finalAst_col_minus));
        Log.e("_short_span_width--3", "calDepthOfSlab: " + String.valueOf(along_short_span_finalAst_mid_plus));
        Log.e("_short_span_width--4", "calDepthOfSlab: " + String.valueOf(along_short_span_finalAst_mid_minus));


    }

    private void checkForTwoWayShear() {

        d2 = ds_for_shorter_side / 2;
        Vu = ((interior_longer_span*interior_shorter_span)-((1165.0/1000.0)*(565.0/1000.0)))*Factored_total_load;
        b0 = (2*1165)+(2*565) ;
        tv = (Vu*1000)/(ds_for_shorter_side*b0);
        ks = 0.5+(size_of_col_breadth/size_of_col_length);
        Takeks = ks>1? 1: ks;
        tc =0.25*Math.sqrt(Fck);
        tc_ = Takeks * tc ;
        Log.e("d2--4", "calDepthOfSlab: " + String.valueOf(d2));
        Log.e("Vu--4", "calDepthOfSlab: " + String.valueOf(Vu));
        Log.e("tv4", "calDepthOfSlab: " + String.valueOf(tv));
        Log.e("ks--4", "calDepthOfSlab: " + String.valueOf(ks));
        Log.e("Takeks--4", "calDepthOfSlab: " + String.valueOf(Takeks));
        Log.e("tc--4", "calDepthOfSlab: " + String.valueOf(tc));
        Log.e("tc--4", "calDepthOfSlab: " + String.valueOf(tc_));
    }


}