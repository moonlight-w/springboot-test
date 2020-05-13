package com.moon.controller;

import com.moon.entity.TbProduct;
import com.moon.service.TbProductService;
import com.moon.utils.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/moon/TbProduct")
public class TbProductController extends BaseController {
	@Value("${upload.dir}")
	private String uploadDir;
	@Autowired
	private TbProductService tbproductService;

	@RequestMapping("showproduct")
	@ResponseBody
	public List<TbProduct> showproduct(){
		List<TbProduct> product = tbproductService.showproduct();
		return product;
	}

	@RequestMapping("/upload")
	@ResponseBody
	public String upload(MultipartFile img) throws IllegalStateException, IOException {
		String uuid = UUID.randomUUID().toString();
		String imgdest = uploadDir + uuid + "-" + img.getOriginalFilename();
		img.transferTo(new File(imgdest));
		tbproductService.updateImg(1, uuid + "-" + img.getOriginalFilename());
		return "上传成功";
	}
	// 根据id获取商品
	@RequestMapping("/selectById")
	@ResponseBody
	public TbProduct selectById(int id) {
		return tbproductService.selectById(id);
	}

}