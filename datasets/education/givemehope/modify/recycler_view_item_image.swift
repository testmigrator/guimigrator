import SwiftUI
struct recycler_view_item_image: View {
    
    var body: some View {
        ZStack()
        {
            VStack
            {
                Image("")
                    .frame(minWidth:0,maxWidth:.infinity)
                    .padding(.top,4)
                    .padding(.leading,4)
                    .padding(.trailing,4)
                HStack
                {
                    Text("@+id/imageFooterTextView")
                        .frame(minWidth:0,idealWidth:0)
                        .italic()
                        .font(.system(size: 12))
                        .foregroundColor(Color.gray)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(16)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct recycler_view_item_image_Previews: PreviewProvider {
    static var previews: some View {
        recycler_view_item_image()
    }
}
