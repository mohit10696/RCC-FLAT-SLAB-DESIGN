package com.example.rccflatslabdesign;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

import static java.lang.Math.PI;

public class FlatSlabCircularDrop extends AppCompatActivity {

    @BindView(R.id.tv_fck)
    TextView tv_fck;
    @BindView(R.id.tv_fy)
    TextView tv_fy;

    @BindView(R.id.ll_material_text)
    LinearLayout ll_material_text;
    @BindView(R.id.ll_material_data)
    LinearLayout ll_material_data;

    @BindView(R.id.ll_prelimitry_text)
    LinearLayout ll_prelimitry_text;
    @BindView(R.id.ll_prelimitry_data)
    LinearLayout ll_prelimitry_data;

    @BindView(R.id.ll_dos_text)
    LinearLayout ll_dos_text;
    @BindView(R.id.ll_dos_data)
    LinearLayout ll_dos_data;

    @BindView(R.id.ll_loadc_text)
    LinearLayout ll_loadc_text;
    @BindView(R.id.ll_loadc_data)
    LinearLayout ll_loadc_data;

    @BindView(R.id.ll_stiff_text)
    LinearLayout ll_stiff_text;
    @BindView(R.id.ll_stiff_data)
    LinearLayout ll_stiff_data;

    @BindView(R.id.ll_corr_text)
    LinearLayout ll_corr_text;
    @BindView(R.id.ll_corr_data)
    LinearLayout ll_corr_data;

    @BindView(R.id.ll_design_text)
    LinearLayout ll_design_text;
    @BindView(R.id.ll_design_data)
    LinearLayout ll_design_data;

    @BindView(R.id.ll_strips_text)
    LinearLayout ll_strips_text;
    @BindView(R.id.ll_strips_data)
    LinearLayout ll_strips_data;

    @BindView(R.id.ll_reinforce_text)
    LinearLayout ll_reinforce_text;
    @BindView(R.id.ll_reinforce_data)
    LinearLayout ll_reinforce_data;
    @BindView(R.id.ll_reinforce_text2)
    LinearLayout ll_reinforce_text2;
    @BindView(R.id.ll_reinforce_data2)
    LinearLayout ll_reinforce_data2;

    @BindView(R.id.ll_two_text)
    LinearLayout ll_two_text;
    @BindView(R.id.ll_two_data)
    LinearLayout ll_two_data;


    @BindView(R.id.tv_Self_weight)
    TextView tv_Self_weight;
    @BindView(R.id.tv_Floor_finish)
    TextView tv_Floor_finish;
    @BindView(R.id.tv_Live_load_1)
    TextView tv_Live_load_1;
    @BindView(R.id.tv_load_total)
    TextView tv_tv_load_total;
    @BindView(R.id.tv_Factored_total_load)
    TextView tv_Factored_total_load;
    @BindView(R.id.tv_Dead_load)
    TextView tv_Dead_load;
    @BindView(R.id.tv_Live_load_2)
    TextView tv_Live_load_2;

    @BindView(R.id.et_interior_longer_span)
    EditText et_interior_longer_span;
    @BindView(R.id.et_interior_shorter_span)
    EditText et_interior_shorter_span;
    @BindView(R.id.et_size_of_col_dia)
    EditText et_size_of_col_dia;
    @BindView(R.id.et_live_load)
    EditText et_live_load;
    @BindView(R.id.et_floor_finish)
    EditText et_floor_finish;
    @BindView(R.id.et_height_of_col)
    EditText et_height_of_col;
    @BindView(R.id.tv_col_head_length)
    TextView tv_col_head_length;


    @BindView(R.id.tv_m_f)
    TextView tv_M_F;
    @BindView(R.id.tv_depth)
    TextView tv_depth;
    @BindView(R.id.tv_Provide_overall_depth)
    TextView tv_Provide_overall_depth;
    @BindView(R.id.tv_depth_without_effective_cover)
    TextView tv_depth_without_effective_cover;
    @BindView(R.id.tv_dl_for_longer_side)
    TextView tv_dl_for_longer_side;
    @BindView(R.id.tv_thinkness_of_slab)
    TextView tv_thinkness_of_slab;
    @BindView(R.id.tv_Provide_depth_of_drop)
    TextView tv_Provide_depth_of_drop;

    @BindView(R.id.tv_along_longer_kc)
    TextView tv_along_longer_kc;
    @BindView(R.id.tv_along_longer_ks)
    TextView tv_along_longer_ks;
    @BindView(R.id.tv_along_longer_alphac)
    TextView tv_along_longer_alphac;
    @BindView(R.id.tv_along_shorter_kc)
    TextView tv_along_shorter_kc;
    @BindView(R.id.tv_along_shorter_ks)
    TextView tv_along_shorter_ks;
    @BindView(R.id.tv_along_shorter_alphac)
    TextView tv_along_shorter_alphac;

    @BindView(R.id.tv_ratio_ll_dl)
    TextView tv_ratio_ll_dl;
    @BindView(R.id.tv_ratio_ll_dl_text)
    TextView tv_ratio_ll_dl_text;

    @BindView(R.id.tv_square_col_head)
    TextView tv_square_col_head;
    @BindView(R.id.tv_provide_col_head)
    TextView tv_provide_col_head;
    @BindView(R.id.tv_along_longer_direction_ln)
    TextView tv_along_longer_direction_ln;
    @BindView(R.id.tv_along_longer_direction_Mol)
    TextView tv_along_longer_direction_Mol;
    @BindView(R.id.tv_along_shorter_direction_ln)
    TextView tv_along_shorter_direction_ln;
    @BindView(R.id.tv_along_shorter_direction_Mol)
    TextView tv_along_shorter_direction_Mol;

    @BindView(R.id.tv_along_long_span_col_1)
    TextView tv_along_long_span_col_1;
    @BindView(R.id.tv_along_long_span_col_2)
    TextView tv_along_long_span_col_2;
    @BindView(R.id.tv_along_long_span_width_col)
    TextView tv_along_long_span_width_col;
    @BindView(R.id.tv_along_long_span_width_mid)
    TextView tv_along_long_span_width_mid;
    @BindView(R.id.tv_along_short_span_col_1)
    TextView tv_along_short_span_col_1;
    @BindView(R.id.tv_along_short_span_col_2)
    TextView tv_along_short_span_col_2;
    @BindView(R.id.tv_along_short_span_width_col)
    TextView tv_along_short_span_width_col;
    @BindView(R.id.tv_along_short_span_width_mid)
    TextView tv_along_short_span_width_mid;


    @BindView(R.id.tv_along_long_span_mu_col_plus)
    TextView tv_along_long_span_mu_col_plus;
    @BindView(R.id.tv_along_long_span_ptpersontage_col_plus)
    TextView tv_along_long_span_ptpersontage_col_plus;
    @BindView(R.id.tv_along_long_span_takept_col_plus)
    TextView tv_along_long_span_takept_col_plus;
    @BindView(R.id.tv_along_long_span_totalast_col_plus)
    TextView tv_along_long_span_totalast_col_plus;
    @BindView(R.id.tv_along_long_span_astbyM_col_plus)
    TextView tv_along_long_span_astbyM_col_plus;
    @BindView(R.id.tv_along_long_span_provided_col_plus)
    TextView tv_along_long_span_provided_col_plus;
    @BindView(R.id.tv_along_long_span_finalAst_col_plus)
    TextView tv_along_long_span_finalAst_col_plus;
    @BindView(R.id.tv_along_long_span_mu_mid_plus)
    TextView tv_along_long_span_mu_mid_plus;
    @BindView(R.id.tv_along_long_span_ptpersontage_mid_plus)
    TextView tv_along_long_span_ptpersontage_mid_plus;
    @BindView(R.id.tv_along_long_span_takept_mid_plus)
    TextView tv_along_long_span_takept_mid_plus;
    @BindView(R.id.tv_along_long_span_totalast_mid_plus)
    TextView tv_along_long_span_totalast_mid_plus;
    @BindView(R.id.tv_along_long_span_astbyM_mid_plus)
    TextView tv_along_long_span_astbyM_mid_plus;
    @BindView(R.id.tv_along_long_span_provided_mid_plus)
    TextView tv_along_long_span_provided_mid_plus;
    @BindView(R.id.tv_along_long_span_finalAst_mid_plus)
    TextView tv_along_long_span_finalAst_mid_plus;
    @BindView(R.id.tv_along_long_span_col_width)
    TextView tv_along_long_span_col_width;
    @BindView(R.id.tv_along_long_span_mu_col_minus)
    TextView tv_along_long_span_mu_col_minus;
    @BindView(R.id.tv_along_long_span_ptpersontage_col_minus)
    TextView tv_along_long_span_ptpersontage_col_minus;
    @BindView(R.id.tv_along_long_span_takept_col_minus)
    TextView tv_along_long_span_takept_col_minus;
    @BindView(R.id.tv_along_long_span_totalast_col_minus)
    TextView tv_along_long_span_totalast_col_minus;
    @BindView(R.id.tv_along_long_span_astbyM_col_minus)
    TextView tv_along_long_span_astbyM_col_minus;
    @BindView(R.id.tv_along_long_span_provided_col_minus)
    TextView tv_along_long_span_provided_col_minus;
    @BindView(R.id.tv_along_long_span_finalAst_col_minus)
    TextView tv_along_long_span_finalAst_col_minus;
    @BindView(R.id.tv_along_long_span_mid_width)
    TextView tv_along_long_span_mid_width;
    @BindView(R.id.tv_along_long_span_mu_mid_minus)
    TextView tv_along_long_span_mu_mid_minus;
    @BindView(R.id.tv_along_long_span_ptpersontage_mid_minus)
    TextView tv_along_long_span_ptpersontage_mid_minus;
    @BindView(R.id.tv_along_long_span_takept_mid_minus)
    TextView tv_along_long_span_takept_mid_minus;
    @BindView(R.id.tv_along_long_span_totalast_mid_minus)
    TextView tv_along_long_span_totalast_mid_minus;
    @BindView(R.id.tv_along_long_span_astbyM_mid_minus)
    TextView tv_along_long_span_astbyM_mid_minus;
    @BindView(R.id.tv_along_long_span_provided_mid_minus)
    TextView tv_along_long_span_provided_mid_minus;
    @BindView(R.id.tv_along_long_span_finalAst_mid_minus)
    TextView tv_along_long_span_finalAst_mid_minus;

    @BindView(R.id.tv_along_short_span_mu_col_plus)
    TextView tv_along_short_span_mu_col_plus;
    @BindView(R.id.tv_along_short_span_ptpersontage_col_plus)
    TextView tv_along_short_span_ptpersontage_col_plus;
    @BindView(R.id.tv_along_short_span_takept_col_plus)
    TextView tv_along_short_span_takept_col_plus;
    @BindView(R.id.tv_along_short_span_totalast_col_plus)
    TextView tv_along_short_span_totalast_col_plus;
    @BindView(R.id.tv_along_short_span_astbyM_col_plus)
    TextView tv_along_short_span_astbyM_col_plus;
    @BindView(R.id.tv_along_short_span_provided_col_plus)
    TextView tv_along_short_span_provided_col_plus;
    @BindView(R.id.tv_along_short_span_finalAst_col_plus)
    TextView tv_along_short_span_finalAst_col_plus;
    @BindView(R.id.tv_along_short_span_mu_mid_plus)
    TextView tv_along_short_span_mu_mid_plus;
    @BindView(R.id.tv_along_short_span_ptpersontage_mid_plus)
    TextView tv_along_short_span_ptpersontage_mid_plus;
    @BindView(R.id.tv_along_short_span_takept_mid_plus)
    TextView tv_along_short_span_takept_mid_plus;
    @BindView(R.id.tv_along_short_span_totalast_mid_plus)
    TextView tv_along_short_span_totalast_mid_plus;
    @BindView(R.id.tv_along_short_span_astbyM_mid_plus)
    TextView tv_along_short_span_astbyM_mid_plus;
    @BindView(R.id.tv_along_short_span_provided_mid_plus)
    TextView tv_along_short_span_provided_mid_plus;
    @BindView(R.id.tv_along_short_span_finalAst_mid_plus)
    TextView tv_along_short_span_finalAst_mid_plus;
    @BindView(R.id.tv_along_short_span_col_width)
    TextView tv_along_short_span_col_width;
    @BindView(R.id.tv_along_short_span_mu_col_minus)
    TextView tv_along_short_span_mu_col_minus;
    @BindView(R.id.tv_along_short_span_ptpersontage_col_minus)
    TextView tv_along_short_span_ptpersontage_col_minus;
    @BindView(R.id.tv_along_short_span_takept_col_minus)
    TextView tv_along_short_span_takept_col_minus;
    @BindView(R.id.tv_along_short_span_totalast_col_minus)
    TextView tv_along_short_span_totalast_col_minus;
    @BindView(R.id.tv_along_short_span_astbyM_col_minus)
    TextView tv_along_short_span_astbyM_col_minus;
    @BindView(R.id.tv_along_short_span_provided_col_minus)
    TextView tv_along_short_span_provided_col_minus;
    @BindView(R.id.tv_along_short_span_finalAst_col_minus)
    TextView tv_along_short_span_finalAst_col_minus;
    @BindView(R.id.tv_along_short_span_mid_width)
    TextView tv_along_short_span_mid_width;
    @BindView(R.id.tv_along_short_span_mu_mid_minus)
    TextView tv_along_short_span_mu_mid_minus;
    @BindView(R.id.tv_along_short_span_ptpersontage_mid_minus)
    TextView tv_along_short_span_ptpersontage_mid_minus;
    @BindView(R.id.tv_along_short_span_takept_mid_minus)
    TextView tv_along_short_span_takept_mid_minus;
    @BindView(R.id.tv_along_short_span_totalast_mid_minus)
    TextView tv_along_short_span_totalast_mid_minus;
    @BindView(R.id.tv_along_short_span_astbyM_mid_minus)
    TextView tv_along_short_span_astbyM_mid_minus;
    @BindView(R.id.tv_along_short_span_provided_mid_minus)
    TextView tv_along_short_span_provided_mid_minus;
    @BindView(R.id.tv_along_short_span_finalAst_mid_minus)
    TextView tv_along_short_span_finalAst_mid_minus;

    @BindView(R.id.tv_d2)
    TextView tv_d2;
    @BindView(R.id.tv_Vu)
    TextView tv_Vu;
    @BindView(R.id.tv_b0)
    TextView tv_b0;
    @BindView(R.id.tv_tv)
    TextView tv_tv;
    @BindView(R.id.tv_ks)
    TextView tv_ks;
    @BindView(R.id.tv_tc)
    TextView tv_tc;
    @BindView(R.id.tv_tc_)
    TextView tv_tc_;
    @BindView(R.id.tv_two_status)
    TextView tv_two_status;
    @BindView(R.id.tv_Takeks)
    TextView tv_Takeks;

    //Material property
    double Fck = 20;
    double Fy = 415;

    //PRELIMINARY DIMENSION
    double interior_longer_span = 6;
    double interior_shorter_span = 4;
    double size_of_col_dia = 400;
    double col_head_dia = 2 * size_of_col_dia;
    double live_load = 4;
    double floor_finish = 3;
    double height_of_col = 4.2;

    //DEPTH OF SLAB
    double assume_pt = 0.40;
    double M_F;
    double depth;
    double Provide_overall_depth;
    double assume_theta = 10;
    double clear_cover = 20;
    double depth_without_effective_cover;

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

    double ratiolldl;

    //TOTAL DESIGN MOMENTS
    double square_col_head;
    double provide_col_head;
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
    double along_long_span_d2;
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
    double b_;
    double Vu;
    double b0;
    double tv;
    double ks;
    double Takeks;
    double tc;
    double tc_;


    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_slab_circular_drop);
        ButterKnife.bind(this);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#fbbc04")));
        getSupportActionBar().setTitle("RCC FLAT SLAB DESIGN (CIRCULAR COLUMN WITH COLUMN HEAD)");
        calDepthOfSlab();
        loadCalculation();
        stiffnessCalculation();
        checkForCorrection();
        totalDesignMoment();
        ColumnStripsAndMiddleStrips();
        provideReinfrocement();
        checkForTwoWayShear();
        initview();

        et_interior_longer_span.setText(String.valueOf(interior_longer_span));
        et_interior_shorter_span.setText(String.valueOf(interior_shorter_span));
        et_size_of_col_dia.setText(String.valueOf(size_of_col_dia));

        et_live_load.setText(String.valueOf(live_load));
        et_floor_finish.setText(String.valueOf(floor_finish));
        et_height_of_col.setText(String.valueOf(height_of_col));
        et_interior_longer_span.addTextChangedListener(new FlatSlabCircularDrop.MyTextWatcher());
        et_interior_shorter_span.addTextChangedListener(new FlatSlabCircularDrop.MyTextWatcher());
        et_size_of_col_dia.addTextChangedListener(new FlatSlabCircularDrop.MyTextWatcher());
        et_live_load.addTextChangedListener(new FlatSlabCircularDrop.MyTextWatcher());
        et_floor_finish.addTextChangedListener(new FlatSlabCircularDrop.MyTextWatcher());
        et_height_of_col.addTextChangedListener(new FlatSlabCircularDrop.MyTextWatcher());


    }

    private void initview() {
        tv_fck.setText(String.valueOf(Fck) + " N/mm²");
        tv_fy.setText(String.valueOf(Fy) + " N/mm²");

        tv_col_head_length.setText(String.valueOf(col_head_dia) + " mm");

        tv_M_F.setText(String.valueOf(M_F));
        tv_depth.setText(String.valueOf(depth) + " mm");
        tv_Provide_overall_depth.setText(String.valueOf(Provide_overall_depth) + " mm");
        tv_depth_without_effective_cover.setText(String.valueOf(depth_without_effective_cover) + " mm");

        tv_Self_weight.setText(String.valueOf(Self_weight) + " kN*m");
        tv_Floor_finish.setText(String.valueOf(Floor_finish) + " kN*m");
        tv_Live_load_1.setText(String.valueOf(Live_load_1) + " kN*m");
        tv_tv_load_total.setText(String.valueOf(load_total) + " kN*m");
        tv_Factored_total_load.setText(String.valueOf(Factored_total_load) + " kN*m");
        tv_Dead_load.setText(String.valueOf(Dead_load) + " kN*m");
        tv_Live_load_2.setText(String.valueOf(Live_load_2) + " kN*m");

        tv_along_longer_kc.setText(String.valueOf(along_longer_kc));
        tv_along_longer_ks.setText(String.valueOf(along_longer_ks));
        tv_along_longer_alphac.setText(String.valueOf(along_longer_alphac));
        tv_along_shorter_kc.setText(String.valueOf(along_shorter_kc));
        tv_along_shorter_ks.setText(String.valueOf(along_shorter_ks));
        tv_along_shorter_alphac.setText(String.valueOf(along_shorter_alphac));

        tv_ratio_ll_dl.setText(String.valueOf(ratiolldl));
        if (ratiolldl <= 0.5) {
            tv_ratio_ll_dl_text.setText("OK");
        } else {
            tv_ratio_ll_dl_text.setText("NOT OK, CORRECTION REQUIRED");
            tv_ratio_ll_dl_text.setTextColor(R.color.red);
        }

        tv_along_longer_direction_ln.setText(String.valueOf(along_longer_direction_ln) + " m");
        tv_along_longer_direction_Mol.setText(String.valueOf(along_longer_direction_Mol) + " kN*m");
        tv_along_shorter_direction_ln.setText(String.valueOf(along_shorter_direction_ln) + " m");
        tv_along_shorter_direction_Mol.setText(String.valueOf(along_shorter_direction_Mol) + " kN*m");
        tv_square_col_head.setText(String.valueOf(square_col_head) + " mm");
        tv_provide_col_head.setText(String.valueOf(provide_col_head) + " mm");


        tv_along_long_span_col_1.setText(String.valueOf(along_long_span_col_1) + " mm");
        tv_along_long_span_col_2.setText(String.valueOf(along_long_span_col_2) + " mm");
        tv_along_long_span_width_col.setText(String.valueOf(along_long_span_width_col) + " mm");
        tv_along_long_span_width_mid.setText(String.valueOf(along_long_span_width_mid) + " mm");
        tv_along_short_span_col_1.setText(String.valueOf(along_short_span_col_1) + " mm");
        tv_along_short_span_col_2.setText(String.valueOf(along_short_span_col_2) + " mm");
        tv_along_short_span_width_col.setText(String.valueOf(along_short_span_width_col) + " mm");
        tv_along_short_span_width_mid.setText(String.valueOf(along_short_span_width_mid) + " mm");

        tv_along_long_span_mu_col_plus.setText(String.valueOf(along_long_span_mu_col_plus)+" kN*m");
        tv_along_long_span_ptpersontage_col_plus.setText(String.valueOf(centralStore.round(along_long_span_ptpersontage_col_plus,2))+" %");
        tv_along_long_span_takept_col_plus.setText(String.valueOf(centralStore.round(along_long_span_takept_col_plus,2))+" %");
        tv_along_long_span_totalast_col_plus.setText(String.valueOf(centralStore.round(along_long_span_totalast_col_plus,2))+" mm²");
        tv_along_long_span_astbyM_col_plus.setText(String.valueOf(centralStore.round(along_long_span_astbyM_col_plus,2))+" mm²");
        tv_along_long_span_provided_col_plus.setText("16 dia. @"+String.valueOf(along_long_span_provided_col_plus)+" mm²");
        tv_along_long_span_finalAst_col_plus.setText(String.valueOf(along_long_span_finalAst_col_plus)+" mm²");
        tv_along_long_span_mu_mid_plus.setText(String.valueOf(along_long_span_mu_mid_plus)+" kN*m");
        tv_along_long_span_ptpersontage_mid_plus.setText(String.valueOf(centralStore.round(along_long_span_ptpersontage_mid_plus,2))+" %");
        tv_along_long_span_takept_mid_plus.setText(String.valueOf(centralStore.round(along_long_span_takept_mid_plus,2))+" %");
        tv_along_long_span_totalast_mid_plus.setText(String.valueOf(centralStore.round(along_long_span_totalast_mid_plus,2))+" mm²");
        tv_along_long_span_astbyM_mid_plus.setText(String.valueOf(centralStore.round(along_long_span_astbyM_mid_plus,2))+" mm²");
        tv_along_long_span_provided_mid_plus.setText("10 dia. @"+String.valueOf(along_long_span_provided_mid_plus)+" mm²");
        tv_along_long_span_finalAst_mid_plus.setText(String.valueOf(along_long_span_finalAst_mid_plus)+" mm²");
        tv_along_long_span_col_width.setText(String.valueOf(along_long_span_col_width)+" mm");
        tv_along_long_span_mu_col_minus.setText(String.valueOf(along_long_span_mu_col_minus)+" kN*m");
        tv_along_long_span_ptpersontage_col_minus.setText(String.valueOf(centralStore.round(along_long_span_ptpersontage_col_minus,2))+" %");
        tv_along_long_span_takept_col_minus.setText(String.valueOf(centralStore.round(along_long_span_takept_col_minus,2))+" %");
        tv_along_long_span_totalast_col_minus.setText(String.valueOf(centralStore.round(along_long_span_totalast_col_minus,2))+" mm²");
        tv_along_long_span_astbyM_col_minus.setText(String.valueOf(centralStore.round(along_long_span_astbyM_col_minus,2))+" mm²");
        tv_along_long_span_provided_col_minus.setText("8 dia. @"+String.valueOf(along_long_span_provided_col_minus)+" mm²");
        tv_along_long_span_finalAst_col_minus.setText(String.valueOf(along_long_span_finalAst_col_minus)+" mm²");
        tv_along_long_span_mid_width.setText(String.valueOf(along_long_span_mid_width)+" mm²");
        tv_along_long_span_mu_mid_minus.setText(String.valueOf(along_long_span_mu_mid_minus)+" kN*m");
        tv_along_long_span_ptpersontage_mid_minus.setText(String.valueOf(centralStore.round(along_long_span_ptpersontage_mid_minus,2))+" %");
        tv_along_long_span_takept_mid_minus.setText(String.valueOf(centralStore.round(along_long_span_takept_mid_minus,2))+" %");
        tv_along_long_span_totalast_mid_minus.setText(String.valueOf(centralStore.round(along_long_span_totalast_mid_minus,2))+" mm²");
        tv_along_long_span_astbyM_mid_minus.setText(String.valueOf(centralStore.round(along_long_span_astbyM_mid_minus,2))+" mm²");
        tv_along_long_span_provided_mid_minus.setText("8 dia. @"+String.valueOf(along_long_span_provided_mid_minus)+" mm²");
        tv_along_long_span_finalAst_mid_minus.setText(String.valueOf(along_long_span_finalAst_mid_minus)+" mm²");


        tv_along_short_span_mu_col_plus.setText(String.valueOf(along_short_span_mu_col_plus)+" kN*m");
        tv_along_short_span_ptpersontage_col_plus.setText(String.valueOf(centralStore.round(along_short_span_ptpersontage_col_plus,2))+" %");
        tv_along_short_span_takept_col_plus.setText(String.valueOf(centralStore.round(along_short_span_takept_col_plus,2))+" %");
        tv_along_short_span_totalast_col_plus.setText(String.valueOf(centralStore.round(along_short_span_totalast_col_plus,2))+" mm²");
        tv_along_short_span_astbyM_col_plus.setText(String.valueOf(centralStore.round(along_short_span_astbyM_col_plus,2))+" mm²");
        tv_along_short_span_provided_col_plus.setText("16 dia. @"+String.valueOf(along_short_span_provided_col_plus)+" mm²");
        tv_along_short_span_finalAst_col_plus.setText(String.valueOf(along_short_span_finalAst_col_plus)+" mm²");
        tv_along_short_span_mu_mid_plus.setText(String.valueOf(along_short_span_mu_mid_plus)+" kN*m");
        tv_along_short_span_ptpersontage_mid_plus.setText(String.valueOf(centralStore.round(along_short_span_ptpersontage_mid_plus,2))+" %");
        tv_along_short_span_takept_mid_plus.setText(String.valueOf(centralStore.round(along_short_span_takept_mid_plus,2))+" %");
        tv_along_short_span_totalast_mid_plus.setText(String.valueOf(centralStore.round(along_short_span_totalast_mid_plus,2))+" mm²");
        tv_along_short_span_astbyM_mid_plus.setText(String.valueOf(centralStore.round(along_short_span_astbyM_mid_plus,2))+" mm²");
        tv_along_short_span_provided_mid_plus.setText("10 dia. @"+String.valueOf(along_short_span_provided_mid_plus)+" mm²");
        tv_along_short_span_finalAst_mid_plus.setText(String.valueOf(along_short_span_finalAst_mid_plus)+" mm²");
        tv_along_short_span_col_width.setText(String.valueOf(along_short_span_col_width)+" mm");
        tv_along_short_span_mu_col_minus.setText(String.valueOf(along_short_span_mu_col_minus)+" kN*m");
        tv_along_short_span_ptpersontage_col_minus.setText(String.valueOf(centralStore.round(along_short_span_ptpersontage_col_minus,2))+" %");
        tv_along_short_span_takept_col_minus.setText(String.valueOf(centralStore.round(along_short_span_takept_col_minus,2))+" %");
        tv_along_short_span_totalast_col_minus.setText(String.valueOf(centralStore.round(along_short_span_totalast_col_minus,2))+" mm²");
        tv_along_short_span_astbyM_col_minus.setText(String.valueOf(centralStore.round(along_short_span_astbyM_col_minus,2))+" mm²");
        tv_along_short_span_provided_col_minus.setText("8 dia. @"+String.valueOf(along_short_span_provided_col_minus)+" mm²");
        tv_along_short_span_finalAst_col_minus.setText(String.valueOf(along_short_span_finalAst_col_minus)+" mm²");
        tv_along_short_span_mid_width.setText(String.valueOf(along_short_span_mid_width)+" mm²");
        tv_along_short_span_mu_mid_minus.setText(String.valueOf(along_short_span_mu_mid_minus)+" kN*m");
        tv_along_short_span_ptpersontage_mid_minus.setText(String.valueOf(centralStore.round(along_short_span_ptpersontage_mid_minus,2))+" %");
        tv_along_short_span_takept_mid_minus.setText(String.valueOf(centralStore.round(along_short_span_takept_mid_minus,2))+" %");
        tv_along_short_span_totalast_mid_minus.setText(String.valueOf(centralStore.round(along_short_span_totalast_mid_minus,2))+" mm²");
        tv_along_short_span_astbyM_mid_minus.setText(String.valueOf(centralStore.round(along_short_span_astbyM_mid_minus,2))+" mm²");
        tv_along_short_span_provided_mid_minus.setText("8 dia. @"+String.valueOf(along_short_span_provided_mid_minus)+" mm²");
        tv_along_short_span_finalAst_mid_minus.setText(String.valueOf(along_short_span_finalAst_mid_minus)+" mm²");

        tv_d2.setText(String.valueOf(d2) + " mm");
        tv_Vu.setText(String.valueOf(Vu) + " kN");
        tv_b0.setText(String.valueOf(b0) + " mm");
        tv_tv.setText(String.valueOf(tv) + " N/mm²");
        tv_ks.setText(String.valueOf(ks));
        tv_Takeks.setText(String.valueOf(Takeks));
        tv_tc.setText(String.valueOf(tc) + " N/mm²");
        tv_tc_.setText(String.valueOf(tc_) + " N/mm²");
        if (tv < tc_) {
            tv_two_status.setText("OK");
        } else {
            tv_two_status.setText("NOT OK, Shear reinforecement is required");
            tv_two_status.setTextColor(R.color.red);
        }
    }
    private void calDepthOfSlab() {
        col_head_dia = 2 * size_of_col_dia;
        M_F = Math.round(1 / (1 + (0.625 * Math.log10(assume_pt))) * 10) / 10.0;
        depth = Math.max((interior_longer_span * 1000) / (26 * M_F), 125);
        Provide_overall_depth = centralStore.roundup(depth, -2);
        depth_without_effective_cover = Provide_overall_depth - (assume_theta / 2) - clear_cover;
        Log.e("x", "calDepthOfSlab: " + col_head_dia);
        Log.e("x", "calDepthOfSlab: " + M_F);
        Log.e("x", "calDepthOfSlab: " + depth);
        Log.e("x", "calDepthOfSlab: " + Provide_overall_depth);
        Log.e("x", "calDepthOfSlab: " + depth_without_effective_cover);
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
        along_longer_kc = ((4 * 2 * 100000 * (3.14159 / 64) * Math.pow(size_of_col_dia, 4)) / (height_of_col * 1000));
        along_longer_ks = (4 * 2 * 100000 * interior_shorter_span * 1000 * Math.pow(Provide_overall_depth, 3)) / (interior_longer_span * 1000 * 12);
        along_longer_alphac = Math.round(along_longer_kc / along_longer_ks * 100) / 100.0;
        along_shorter_kc = ((4 * 2 * 100000 * (3.14159 / 64) * Math.pow(size_of_col_dia, 4)) / (height_of_col * 1000));
        along_shorter_ks = (4 * 1 * 2 * 100000 * interior_longer_span * 1000 * Math.pow(Provide_overall_depth, 3)) / (interior_shorter_span * 1000 * 12);
        along_shorter_alphac = Math.round(along_shorter_kc / along_shorter_ks * 100) / 100.0;

    }

    private void checkForCorrection() {
        //CHECK FOR CORRECTION DUE TO PATTERN LOADING
        ratiolldl = live_load / Dead_load;
    }

    private void totalDesignMoment() {
        square_col_head = Math.sqrt((3.14159 / 4) * Math.pow(col_head_dia, 2));
        provide_col_head = centralStore.ROUNDDOWN(square_col_head, -1);
        along_longer_direction_ln = interior_longer_span - (provide_col_head / 1000);
        along_longer_direction_Mol = Math.round((Factored_total_load * interior_shorter_span * Math.pow(along_longer_direction_ln, 2)) / 8 * 100) / 100.0;
        along_shorter_direction_ln = interior_shorter_span - (provide_col_head / 1000);
        along_shorter_direction_Mol = Math.round((Factored_total_load * interior_longer_span * along_shorter_direction_ln * along_shorter_direction_ln) / 8 * 100) / 100.0;

    }

    private void ColumnStripsAndMiddleStrips(){
        along_long_span_col_1 = 2 * (0.25 * interior_longer_span * 1000);
        along_long_span_col_2 = 2 * (0.25 * interior_shorter_span * 1000);
        along_long_span_width_col = Math.min(along_long_span_col_1, along_long_span_col_2);
        along_long_span_width_mid = (interior_shorter_span * 1000) - along_long_span_width_col;
//        Log.e("along_long_span_width", "calDepthOfSlab: " + String.valueOf(along_long_span_width_mid));
        along_short_span_col_1 = 2 * (0.25 * interior_shorter_span * 1000);
        along_short_span_col_2 = 2 * (0.25 * interior_longer_span * 1000);
        along_short_span_width_col = Math.min(along_short_span_col_1, along_short_span_col_2);
        along_short_span_width_mid = (interior_longer_span * 1000) - along_short_span_width_col;
//        Log.e("along_short_span_width", "calDepthOfSlab: " + String.valueOf(along_short_span_width_mid));


    }

    private void provideReinfrocement() {
        //provide reinfrocemnet
        along_long_span_mol = along_longer_direction_Mol;
        along_long_span_d = depth_without_effective_cover;
        along_long_span_d2 = depth_without_effective_cover;
        along_long_span_col_width = along_long_span_width_col;
        along_long_span_mid_width = along_long_span_width_mid;
        along_long_span_mu_col_plus = 0.65 * 0.75 * along_long_span_mol;
        along_long_span_mu_col_minus = 0.35 * 0.6 * along_long_span_mol;
        along_long_span_mu_mid_plus = (0.65 * along_long_span_mol) - along_long_span_mu_col_plus;
        along_long_span_mu_mid_minus = (0.35 * along_long_span_mol) - along_long_span_mu_col_minus;
        along_long_span_ptpersontage_col_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_col_plus * 1000000) / (Fck * along_long_span_col_width * Math.pow(along_long_span_d2, 2)))));
        along_long_span_ptpersontage_col_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_col_minus * 1000000) / (Fck * along_long_span_col_width * Math.pow(along_long_span_d, 2)))));
        along_long_span_ptpersontage_mid_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_mid_plus * 1000000) / (Fck * along_long_span_mid_width * Math.pow(along_long_span_d, 2)))));
        along_long_span_ptpersontage_mid_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_long_span_mu_mid_minus * 1000000) / (Fck * along_long_span_mid_width * Math.pow(along_long_span_d, 2)))));
        along_long_span_takept_col_plus = Math.max(along_long_span_ptpersontage_col_plus, 0.12);
        along_long_span_takept_col_minus = Math.max(along_long_span_ptpersontage_col_minus, 0.12);
        along_long_span_takept_mid_plus = Math.max(along_long_span_ptpersontage_mid_plus, 0.12);
        along_long_span_takept_mid_minus = Math.max(along_long_span_ptpersontage_mid_minus, 0.12);
        along_long_span_totalast_col_plus = (along_long_span_takept_col_plus / 100) * along_long_span_col_width * along_long_span_d2;
        along_long_span_totalast_col_minus = (along_long_span_takept_col_minus / 100) * along_long_span_col_width * along_long_span_d;
        along_long_span_totalast_mid_plus = (along_long_span_takept_mid_plus / 100) * along_long_span_mid_width * along_long_span_d;
        along_long_span_totalast_mid_minus = (along_long_span_takept_mid_minus / 100) * along_long_span_mid_width * along_long_span_d;
        along_long_span_astbyM_col_plus = along_long_span_totalast_col_plus / (along_long_span_col_width / 1000);
        along_long_span_astbyM_col_minus = along_long_span_totalast_col_minus / (along_long_span_col_width / 1000);
        along_long_span_astbyM_mid_plus = along_long_span_totalast_mid_plus / (along_long_span_mid_width / 1000);
        along_long_span_astbyM_mid_minus = along_long_span_totalast_mid_minus / (along_long_span_mid_width / 1000);
        along_long_span_provided_col_plus = centralStore.ROUNDDOWN((((PI / 4) * 16 * 16) / along_long_span_astbyM_col_plus) * 1000, -1);
        along_long_span_provided_col_minus = centralStore.ROUNDDOWN((((PI / 4) * 10 * 10) / along_long_span_astbyM_col_minus) * 1000, -1);
        along_long_span_provided_mid_plus = centralStore.ROUNDDOWN((((PI / 4) * 8 * 8) / along_long_span_astbyM_mid_plus) * 1000, -1);
        along_long_span_provided_mid_minus = centralStore.ROUNDDOWN((((PI / 4) * 8 * 8) / along_long_span_astbyM_mid_minus) * 1000, -1);
        along_long_span_finalAst_col_plus = Math.round((((PI / 4) * 16 * 16) / along_long_span_provided_col_plus) * 1000);
        along_long_span_finalAst_col_minus = Math.round((((PI / 4) * 10 * 10) / along_long_span_provided_col_minus) * 1000);
        along_long_span_finalAst_mid_plus = Math.round((((PI / 4) * 8 * 8) / along_long_span_provided_mid_plus) * 1000);
        along_long_span_finalAst_mid_minus = Math.round((((PI / 4) * 8 * 8) / along_long_span_provided_mid_minus) * 1000);


        along_short_span_mol = along_shorter_direction_Mol;
        along_short_span_d = depth_without_effective_cover;
        along_short_span_D = depth_without_effective_cover;
        along_short_span_col_width = along_short_span_width_col;
        along_short_span_mid_width = along_short_span_width_mid;
        along_short_span_mu_col_plus = 0.65 * 0.75 * along_short_span_mol;
        along_short_span_mu_col_minus = 0.35 * 0.6 * along_short_span_mol;
        along_short_span_mu_mid_plus = (0.65 * along_short_span_mol) - along_short_span_mu_col_plus;
        along_short_span_mu_mid_minus = (0.35 * along_short_span_mol) - along_short_span_mu_col_minus;
        along_short_span_ptpersontage_col_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_col_plus * 1000000) / (Fck * along_short_span_col_width * Math.pow(along_short_span_D, 2)))));
        along_short_span_ptpersontage_col_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_col_minus * 1000000) / (Fck * along_short_span_col_width * Math.pow(along_short_span_d, 2)))));
        along_short_span_ptpersontage_mid_plus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_mid_plus * 1000000) / (Fck * along_short_span_mid_width * Math.pow(along_short_span_d, 2)))));
        along_short_span_ptpersontage_mid_minus = ((50 * Fck) / Fy) * (1 - Math.sqrt(1 - ((4.6 * along_short_span_mu_mid_minus * 1000000) / (Fck * along_short_span_mid_width * Math.pow(along_short_span_d, 2)))));
        along_short_span_takept_col_plus = Math.max(along_short_span_ptpersontage_col_plus, 0.12);
        along_short_span_takept_col_minus = Math.max(along_short_span_ptpersontage_col_minus, 0.12);
        along_short_span_takept_mid_plus = Math.max(along_short_span_ptpersontage_mid_plus, 0.12);
        along_short_span_takept_mid_minus = Math.max(along_short_span_ptpersontage_mid_minus, 0.12);
        along_short_span_totalast_col_plus = (along_short_span_takept_col_plus / 100) * along_short_span_col_width * along_short_span_D;
        along_short_span_totalast_col_minus = (along_short_span_takept_col_minus / 100) * along_short_span_col_width * along_short_span_d;
        along_short_span_totalast_mid_plus = (along_short_span_takept_mid_plus / 100) * along_short_span_mid_width * along_short_span_d;
        along_short_span_totalast_mid_minus = (along_short_span_takept_mid_minus / 100) * along_short_span_mid_width * along_short_span_d;
        along_short_span_astbyM_col_plus = along_short_span_totalast_col_plus / (along_short_span_col_width / 1000);
        along_short_span_astbyM_col_minus = along_short_span_totalast_col_minus / (along_short_span_col_width / 1000);
        along_short_span_astbyM_mid_plus = along_short_span_totalast_mid_plus / (along_short_span_mid_width / 1000);
        along_short_span_astbyM_mid_minus = along_short_span_totalast_mid_minus / (along_short_span_mid_width / 1000);
        along_short_span_provided_col_plus = centralStore.ROUNDDOWN((((PI / 4) * 16 * 16) / along_short_span_astbyM_col_plus) * 1000, -1);
        along_short_span_provided_col_minus = centralStore.ROUNDDOWN((((PI / 4) * 10 * 10) / along_short_span_astbyM_col_minus) * 1000, -1);
        along_short_span_provided_mid_plus = centralStore.ROUNDDOWN((((PI / 4) * 8 * 8) / along_short_span_astbyM_mid_plus) * 1000, -1);
        along_short_span_provided_mid_minus = centralStore.ROUNDDOWN((((PI / 4) * 8 * 8) / along_short_span_astbyM_mid_minus) * 1000, -1);
        along_short_span_finalAst_col_plus = Math.round((((PI / 4) * 16 * 16) / along_short_span_provided_col_plus) * 1000);
        along_short_span_finalAst_col_minus = Math.round((((PI / 4) * 10 * 10) / along_short_span_provided_col_minus) * 1000);
        along_short_span_finalAst_mid_plus = Math.round((((PI / 4) * 8 * 8) / along_short_span_provided_mid_plus) * 1000);
        along_short_span_finalAst_mid_minus = Math.round((((PI / 4) * 8 * 8) / along_short_span_provided_mid_minus) * 1000);



    }

    private void checkForTwoWayShear() {
        d2 = depth_without_effective_cover / 2;
        b_ = provide_col_head + d2 + d2;
        Vu = ((interior_longer_span*interior_shorter_span)-((875/1000)*(875/1000)))*Factored_total_load;
        b0 = (2 * 875) + (2 * 875);
        tv = (Vu * 1000) / (depth_without_effective_cover * b0);
        ks = 0.5 + (880 / 880);
        Takeks = Math.min(1, ks);
        tc = 0.25 * Math.sqrt(Fck);
        tc_ = tc * Takeks;
        Log.e("x", "calDepthOfSlab: " + d2);
        Log.e("x", "calDepthOfSlab: " + b_);
        Log.e("x", "calDepthOfSlab: " + Vu);
        Log.e("x", "calDepthOfSlab: " + b0);
        Log.e("x", "calDepthOfSlab: " + tv);
        Log.e("x", "calDepthOfSlab: " + ks);
        Log.e("x", "calDepthOfSlab: " + Takeks);
        Log.e("x", "calDepthOfSlab: " + tc);

    }

    public void toggleMaterialProperties(View view) {
        if (ll_material_data.getVisibility() == View.GONE) {
            ll_material_data.setVisibility(View.VISIBLE);
            ll_material_text.setVisibility(View.VISIBLE);
        } else if (ll_material_data.getVisibility() == View.VISIBLE) {
            ll_material_data.setVisibility(View.GONE);
            ll_material_text.setVisibility(View.GONE);
        }

    }

    public void togglepPRELIMINARYDIMENSION(View view) {
        if (ll_prelimitry_data.getVisibility() == View.GONE) {
            ll_prelimitry_data.setVisibility(View.VISIBLE);
            ll_prelimitry_text.setVisibility(View.VISIBLE);
        } else if (ll_prelimitry_data.getVisibility() == View.VISIBLE) {
            ll_prelimitry_data.setVisibility(View.GONE);
            ll_prelimitry_text.setVisibility(View.GONE);
        }
    }

    public void toggledosProperties(View view) {
        if (ll_dos_data.getVisibility() == View.GONE) {
            ll_dos_data.setVisibility(View.VISIBLE);
            ll_dos_text.setVisibility(View.VISIBLE);
        } else if (ll_dos_data.getVisibility() == View.VISIBLE) {
            ll_dos_data.setVisibility(View.GONE);
            ll_dos_text.setVisibility(View.GONE);
        }
    }

    public void toggleloadcProperties(View view) {
        if (ll_loadc_data.getVisibility() == View.GONE) {
            ll_loadc_data.setVisibility(View.VISIBLE);
            ll_loadc_text.setVisibility(View.VISIBLE);
        } else if (ll_loadc_data.getVisibility() == View.VISIBLE) {
            ll_loadc_data.setVisibility(View.GONE);
            ll_loadc_text.setVisibility(View.GONE);
        }
    }

    public void togglestiffProperties(View view) {
        if (ll_stiff_data.getVisibility() == View.GONE) {
            ll_stiff_data.setVisibility(View.VISIBLE);
            ll_stiff_text.setVisibility(View.VISIBLE);
        } else if (ll_stiff_data.getVisibility() == View.VISIBLE) {
            ll_stiff_data.setVisibility(View.GONE);
            ll_stiff_text.setVisibility(View.GONE);
        }
    }

    public void togglecorrProperties(View view) {
        if (ll_corr_data.getVisibility() == View.GONE) {
            ll_corr_data.setVisibility(View.VISIBLE);
            ll_corr_text.setVisibility(View.VISIBLE);
        } else if (ll_corr_data.getVisibility() == View.VISIBLE) {
            ll_corr_data.setVisibility(View.GONE);
            ll_corr_text.setVisibility(View.GONE);
        }
    }

    public void toggledesignProperties(View view) {
        if (ll_design_data.getVisibility() == View.GONE) {
            ll_design_data.setVisibility(View.VISIBLE);
            ll_design_text.setVisibility(View.VISIBLE);
        } else if (ll_design_data.getVisibility() == View.VISIBLE) {
            ll_design_data.setVisibility(View.GONE);
            ll_design_text.setVisibility(View.GONE);
        }
    }

    public void togglestripsProperties(View view) {
        if (ll_strips_data.getVisibility() == View.GONE) {
            ll_strips_data.setVisibility(View.VISIBLE);
            ll_strips_text.setVisibility(View.VISIBLE);
        } else if (ll_strips_data.getVisibility() == View.VISIBLE) {
            ll_strips_data.setVisibility(View.GONE);
            ll_strips_text.setVisibility(View.GONE);
        }
    }

    public void togglereinforceProperties(View view) {
        if (ll_reinforce_data.getVisibility() == View.GONE) {
            ll_reinforce_data.setVisibility(View.VISIBLE);
            ll_reinforce_text.setVisibility(View.VISIBLE);
            ll_reinforce_data2.setVisibility(View.VISIBLE);
            ll_reinforce_text2.setVisibility(View.VISIBLE);
        } else if (ll_reinforce_data.getVisibility() == View.VISIBLE) {
            ll_reinforce_data.setVisibility(View.GONE);
            ll_reinforce_text.setVisibility(View.GONE);
            ll_reinforce_data2.setVisibility(View.GONE);
            ll_reinforce_text2.setVisibility(View.GONE);
        }
    }

    public void toggletwoProperties(View view) {
        if (ll_two_data.getVisibility() == View.GONE) {
            ll_two_data.setVisibility(View.VISIBLE);
            ll_two_text.setVisibility(View.VISIBLE);
        } else if (ll_two_data.getVisibility() == View.VISIBLE) {
            ll_two_data.setVisibility(View.GONE);
            ll_two_text.setVisibility(View.GONE);
        }
    }

    public class MyTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
//            Toast.makeText(FlatSlabRectangularCol.this, "hi", Toast.LENGTH_SHORT).show();
            if (et_interior_longer_span.getText().toString().isEmpty()) {
                interior_longer_span = 0.0;
            } else {
                interior_longer_span = Double.parseDouble(et_interior_longer_span.getText().toString());
            }
            if (et_interior_shorter_span.getText().toString().isEmpty()) {
                interior_shorter_span = 0.0;
            } else {
                interior_shorter_span = Double.parseDouble(et_interior_shorter_span.getText().toString());
            }
            if (et_size_of_col_dia.getText().toString().isEmpty()) {
                size_of_col_dia = 0.0;
            } else {
                size_of_col_dia = Double.parseDouble(et_size_of_col_dia.getText().toString());
            }
            if (et_live_load.getText().toString().isEmpty()) {
                live_load = 0.0;
            } else {
                live_load = Double.parseDouble(et_live_load.getText().toString());
            }
            if (et_floor_finish.getText().toString().isEmpty()) {
                floor_finish = 0.0;
            } else {
                floor_finish = Double.parseDouble(et_floor_finish.getText().toString());
            }
            if (et_height_of_col.getText().toString().isEmpty()) {
                height_of_col = 0.0;
            } else {
                height_of_col = Double.parseDouble(et_height_of_col.getText().toString());
            }


            calDepthOfSlab();
            loadCalculation();
            stiffnessCalculation();
            checkForCorrection();
            totalDesignMoment();
            ColumnStripsAndMiddleStrips();
            provideReinfrocement();
            checkForTwoWayShear();
            initview();
        }
    }
}