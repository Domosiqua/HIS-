// 查询列表接口
const getDishPage = (params) => {
  return $axios({
    url: '/scheduling/page',
    method: 'get',
    params
  })
}

// 删除接口
const deleteDish = (id) => {
  return $axios({
    url: '/scheduling/'+id,
    method: 'delete',
  })
}

// 修改接口
const edit = (params) => {
  return $axios({
    url: '/scheduling',
    method: 'put',
    data: { ...params }
  })
}

// 新增接口
const add = (params) => {
  return $axios({
    url: '/scheduling',
    method: 'post',
    data: { ...params }
  })
}

// 查询详情
const queryDishById = (id) => {
  return $axios({
    url: `/scheduling/${id}`,
    method: 'get'
  })
}

// 获取菜品分类列表
const getCategoryList = (params) => {
  return $axios({
    url: '/category/list',
    method: 'get',
    params
  })
}

// 查菜品列表的接口
const queryDishList = (params) => {
  return $axios({
    url: '/dish/list',
    method: 'get',
    params
  })
}

// 文件down预览
const commonDownload = (params) => {
  return $axios({
    headers: {
      'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
    },
    url: '/common/download',
    method: 'get',
    params
  })
}

// 起售停售---批量起售停售接口
const dishStatusByStatus = (params) => {
  return $axios({
    url: `/dish/status/${params.status}`,
    method: 'post',
    params: { ids: params.id }
  })
}